package com.mozu.example.RetailExample.ui.orders;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.mozu.api.contracts.commerceruntime.fulfillment.Package;
import com.mozu.api.contracts.commerceruntime.fulfillment.Pickup;
import com.mozu.api.contracts.commerceruntime.orders.Order;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.ui.lists.IncrementalListAdapter;
import com.mozu.example.RetailExample.ui.lists.ListHolder;
import com.mozu.example.RetailExample.ui.locations.LocationSelectionDialog;

import org.joda.time.format.DateTimeFormat;

/**
 * Created by rodrigo_alvarez on 2/27/14.
 */
public class OrdersFragment extends Fragment implements OrdersView {

    private OrdersPresenter mPresenter;
    private Tenant mTenant;

    private boolean mSimple = false;
    private String mCurrentQuery = "";
    private IncrementalListAdapter<Order> mListAdapter;
    private EditText mSearchEdit;

    //

    private class OrderHolder implements ListHolder<Order> {

        TextView mNumberView;
        TextView mTotalView;
        TextView mItemsView;
        TextView mDateView;
        TextView mFulfillmentView;
        View mStatusPanel;

        @Override
        public View createView(Activity context) {
            View v = context.getLayoutInflater().inflate(R.layout.item_orders, null);
            mNumberView = (TextView)v.findViewById(R.id.number);
            mTotalView = (TextView)v.findViewById(R.id.total);
            mItemsView = (TextView)v.findViewById(R.id.items);
            mDateView = (TextView)v.findViewById(R.id.date);
            mFulfillmentView = (TextView)v.findViewById(R.id.fulfillment);
            mStatusPanel = v.findViewById(R.id.status_color);
            return v;
        }

        @Override
        public void fill(Order order) {
            if(order == null) {

                mNumberView.setText("...");
                mTotalView.setText("");
                mItemsView.setText("");
                mDateView.setText("");
                mFulfillmentView.setText("");
                mStatusPanel.setBackgroundColor(0);

            } else {

                mNumberView.setText(String.valueOf(order.getOrderNumber()));
                mTotalView.setText(getString(R.string.order_total_format,
                        order.getCurrencyCode(),
                        order.getTotal()));
                int items = order.getItems().size();
                mItemsView.setText(String.format(getResources().getQuantityText(R.plurals.plural_items_format, items).toString(), items));
                mDateView.setText(DateTimeFormat.forPattern("MM/dd/yyyy").print(order.getSubmittedDate()));

                if (order.getFulfillmentStatus().equals("Fulfilled")) {

                    mStatusPanel.setBackgroundColor(getResources().getColor(android.R.color.black));
                    mFulfillmentView.setText(R.string.order_fulfilled);

                }
                else {

                    boolean hasUnfulfilledStatus = false;
                    for(Pickup pickup : order.getPickups()) {
                        if(!pickup.getStatus().equals("Fulfilled")) {
                            hasUnfulfilledStatus = true;
                            break;
                        }
                    }

                    if(hasUnfulfilledStatus) {

                        mStatusPanel.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        mFulfillmentView.setText(R.string.order_ready_for_pickup);

                    } else {

                        for(Package pkg : order.getPackages()) {
                            if (!pkg.getStatus().equals("Fulfilled")) {
                                hasUnfulfilledStatus = true;
                                break;
                            }
                        }

                        if(hasUnfulfilledStatus) {

                            mStatusPanel.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                            mFulfillmentView.setText(R.string.order_ready_for_shipment);

                        } else {

                            boolean hasPickupItems = false;
                            for(OrderItem orderItem : order.getItems())
                            {
                                if (orderItem.getFulfillmentMethod().equals("Pickup")) {
                                    hasPickupItems = true;
                                    break;
                                }
                            }

                            mStatusPanel.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));

                            if(hasPickupItems) {

                                mFulfillmentView.setText(R.string.order_pending);

                            } else {

                                mFulfillmentView.setText(R.string.order_pending_shipment);

                            }
                        }
                    }
                }
            }
        }
    }

    //

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!mSimple) {
            getActivity().setProgressBarIndeterminateVisibility(false);
        }

        mListAdapter = new IncrementalListAdapter<Order>(getActivity(), 50) {
            @Override
            protected void onFirstRequestStart() {
                if(!mSimple)
                {
                    if(mPresenter == null) {
                        return;
                    }

                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().setProgressBarIndeterminateVisibility(true);
                        }
                    });
                }
            }

            @Override
            protected void onLastRequestEnd() {
                if(!mSimple)
                {
                    if(mPresenter == null) {
                        return;
                    }

                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().setProgressBarIndeterminateVisibility(false);
                        }
                    });
                }
            }

            @Override
            protected ListHolder<Order> createNewListHolder() {
                return new OrderHolder();
            }

            @Override
            protected void fetchItems(int start, int size, OnFetchResultListener<Order> listener) throws Exception {
                mPresenter.fetchItems(start, size, mCurrentQuery, listener);
            }
        };

        if(!mSimple)
        {
            setHasOptionsMenu(true);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_orders, container, false);

        v.findViewById(R.id.search_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelSearch();
            }
        });

        v.findViewById(R.id.search_panel).setVisibility( mSimple ? View.GONE : View.VISIBLE );

        mSearchEdit = (EditText)v.findViewById(R.id.search_query);
        mSearchEdit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_NULL && event.getAction() == KeyEvent.ACTION_DOWN) {
                    if(!mSearchEdit.getText().toString().trim().equals(mCurrentQuery)) {
                        mCurrentQuery = mSearchEdit.getText().toString().trim();
                        reload();
                    }
                    return true;
                }
                return false;
            }
        });

        ListView listView = (ListView)v.findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mPresenter.onOrderSelected((Order) mListAdapter.getItem(i));
            }
        });
        listView.setAdapter(mListAdapter);

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_orders, menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        if(item.getItemId() == R.id.refresh) {
            mPresenter.onRefresh();
            return true;
        } else if(item.getItemId() == R.id.switch_location) {
            final LocationSelectionDialog dialog = new LocationSelectionDialog(getActivity(), mTenant);
            dialog.show(new LocationSelectionDialog.OnLocationSelectionListener() {
                @Override
                public void onLocationSelection(Location selectedLocation) {
                    dialog.dismiss();
                    if(selectedLocation != null) {
                        mPresenter.setLocation(selectedLocation);
                    }
                }
            });
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            OrdersPresenter.HasOrdersPresenter hasOrdersPresenter = (OrdersPresenter.HasOrdersPresenter) activity;
            mPresenter = hasOrdersPresenter.getOrdersPresenter();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OrdersPresenter.HasOrdersPresenter");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter = null;
    }

    // OrdersView

    @Override
    public void setSimple(boolean simple) {
        mSimple = simple;
    }

    @Override
    public void reload() {
        mListAdapter.initialFetch();
    }

    @Override
    public void setTenant(Tenant tenant) {
        mTenant = tenant;
    }

    @Override
    public Fragment asFragment() {
        return this;
    }

    //

    private void cancelSearch() {
        String text = mSearchEdit.getText().toString();
        if(!text.isEmpty()) {
            mSearchEdit.setText("");
            mCurrentQuery = "";
            hideKeyboard();
            if(!text.trim().isEmpty()) {
                reload();
            }
        }
    }

    private void hideKeyboard() {

        InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mSearchEdit.getWindowToken(), 0);
    }
}
