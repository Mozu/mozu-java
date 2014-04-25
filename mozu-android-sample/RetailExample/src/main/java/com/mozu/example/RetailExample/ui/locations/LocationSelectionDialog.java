package com.mozu.example.RetailExample.ui.locations;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationCollection;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.admin.LocationResource;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.ui.lists.IncrementalListAdapter;
import com.mozu.example.RetailExample.ui.lists.ListHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 2/27/14.
 */
public class LocationSelectionDialog extends Dialog {

    public static interface OnLocationSelectionListener {
        void onLocationSelection(Location location);
    }

    public static class LocationListHolder implements ListHolder<Location> {

        private TextView mName;

        @Override
        public View createView(Activity context) {
            View view = context.getLayoutInflater().inflate(R.layout.item_locations, null);
            mName = (TextView) view.findViewById(R.id.item);
            return view;
        }

        @Override
        public void fill(Location item) {
            if(item == null) {
                mName.setText("...");
            }
            else {
                mName.setText(item.getName());
            }
        }
    }

    //

    private final Activity mActivity;
    private final Tenant mTenant;
    private ListView mListView;

    //

    public LocationSelectionDialog(Activity context, Tenant tenant) {
        super(context);
        mActivity = context;
        mTenant = tenant;
    }

    //

    public void show(final OnLocationSelectionListener listener)
    {
        setOnCancelListener(new OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                listener.onLocationSelection(null);
            }
        });

        setTitle(R.string.dialog_location_selection_title);
        setContentView(R.layout.dialog_location_selection);
        setCancelable(true);
        mListView = (ListView)findViewById(R.id.list_view);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Location item = (Location)mListView.getAdapter().getItem(i);
                listener.onLocationSelection(item);
            }
        });

        IncrementalListAdapter<Location> adapter = new IncrementalListAdapter<Location>(mActivity, 20) {
            @Override
            protected void onFirstRequestStart() {
                // empty
            }

            @Override
            protected void onLastRequestEnd() {
                // empty
            }

            @Override
            protected ListHolder<Location> createNewListHolder() {
                return new LocationListHolder();
            }

            @Override
            protected void fetchItems(final int start, final int size, final OnFetchResultListener<Location> listener) {
                try {

                    ApiContext apiContext = new MozuApiContext(mTenant, null, null, null);
                    LocationResource locationResource = new LocationResource(apiContext);
                    List<Location> locations = new ArrayList<Location>();
                    int i = start;
                    LocationCollection locationCollection = locationResource.getLocations(start, size, null, null);
                    for (Location loc : locationCollection.getItems()) {
                        locations.add(loc);
                        ++i;
                    }
                    listener.onFetchResult(locations, locationCollection.getStartIndex(), locationCollection.getTotalCount().intValue());

                } catch (final Throwable error) {

                    dismiss();
                    mActivity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            new AlertDialog.Builder(getContext())
                                    .setMessage(getContext().getString(R.string.list_fetch_error_message, error.getLocalizedMessage()))
                                    .setCancelable(false)
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            dialogInterface.dismiss();
                                        }
                                    }).show();
                        }
                    });
                }
            }
        };

        mListView.setAdapter(adapter);

        adapter.initialFetch();

        show();
    }
}
