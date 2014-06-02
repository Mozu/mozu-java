package com.mozu.example.RetailExample.ui.main;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.widget.DrawerLayout;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mozu.api.contracts.location.Location;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.model.persistence.Storage;
import com.mozu.example.RetailExample.ui.CommonActivity;
import com.mozu.example.RetailExample.ui.customers.CustomersPresenter;
import com.mozu.example.RetailExample.ui.locations.LocationSelectionDialog;
import com.mozu.example.RetailExample.ui.orders.OrdersPresenter;

public class MainActivity extends CommonActivity implements CustomersPresenter.HasCustomersPresenter, OrdersPresenter.HasOrdersPresenter {

    public static void start(Context ctx) {
        Intent intent = new Intent(ctx, MainActivity.class);
        ctx.startActivity(intent);
    }

    //

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ListView mDrawerList;
    private int mCurrentPosition = 0;
    private final CustomersPresenter mCustomersPresenter = new CustomersPresenter();
    private final OrdersPresenter mOrdersPresenter = new OrdersPresenter();

    //

    @Override
    public void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer, 0, 0);

        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, Gravity.START);

        String[] drawerItems = getResources().getStringArray(R.array.drawer_items);
        mDrawerList.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                selectItem(position);
            }
        });
        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.item_drawer, R.id.item, drawerItems));

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        String locationCode = Storage.INSTANCE.getLocationCode(this);
        if(locationCode == null) {

            final LocationSelectionDialog dialog = new LocationSelectionDialog(this, Storage.INSTANCE.getTenant(this));
            dialog.show(new LocationSelectionDialog.OnLocationSelectionListener() {
                @Override
                public void onLocationSelection(Location selectedLocation) {
                    if(selectedLocation == null) {
                        onBackPressed();
                    }
                    else {
                        dialog.dismiss();
                        Storage.INSTANCE.setLocation(MainActivity.this, selectedLocation.getCode(), selectedLocation.getName());
                        mOrdersPresenter.install(MainActivity.this, R.id.content_frame, null);
                    }
                }
            });
        }
        else {
            mOrdersPresenter.install(this, R.id.content_frame, null);
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        else if(item.getItemId() == R.id.signout) {
            signOut();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //

    private void selectItem(int position) {
        if(mCurrentPosition == position) {
            return;
        }

        if(position == 0) {
            mOrdersPresenter.install(this, R.id.content_frame, null);
        }
        else {
            mCustomersPresenter.install(this, R.id.content_frame);
        }
        mDrawerLayout.closeDrawer(mDrawerList);
        mCurrentPosition = position;
    }

    //

    @Override
    public CustomersPresenter getCustomersPresenter() {
        return mCustomersPresenter;
    }

    @Override
    public OrdersPresenter getOrdersPresenter() {
        return mOrdersPresenter;
    }
}
