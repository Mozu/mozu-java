package com.mozu.android.SalesAssistantUnbranded.ui.orders;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.mozu.android.SalesAssistantUnbranded.R;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.commerceruntime.orders.Order;
import com.mozu.api.contracts.commerceruntime.orders.OrderCollection;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.OrderResource;
import com.mozu.android.SalesAssistantUnbranded.model.persistence.Storage;
import com.mozu.android.SalesAssistantUnbranded.ui.CommonActivity;
import com.mozu.android.SalesAssistantUnbranded.ui.lists.IncrementalListAdapter;
import com.mozu.android.SalesAssistantUnbranded.ui.order.OrderActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 2/27/14.
 */
public class OrdersPresenter {

    public static interface HasOrdersPresenter {
        OrdersPresenter getOrdersPresenter();
    }

    //

    private Integer mCustomerId;
    private String mLocationCode;
    private Tenant mTenant;
    private final OrdersView mView = new OrdersFragment();
    private CommonActivity mParent;

    //

    public void install(CommonActivity activity, int containerId, Integer customerId)
    {
        mParent = activity;

        mCustomerId = customerId;
        if(mCustomerId == null) {
            mParent.setTitle(mParent.getString(R.string.orders_title, Storage.INSTANCE.getLocationName(mParent)));
        }

        mTenant = Storage.INSTANCE.getTenant(mParent);
        mView.setTenant(mTenant);
        mView.setSimple(mCustomerId != null);

        FragmentManager manager = mParent.getFragmentManager();
        FragmentTransaction tran = manager.beginTransaction();
        tran.replace(containerId, mView.asFragment());
        tran.commit();
        manager.executePendingTransactions();

        mLocationCode = Storage.INSTANCE.getLocationCode(mParent);

        mView.reload();
    }


    public void setLocation(Location location) {
        mLocationCode = location.getCode();
        Storage.INSTANCE.setLocation(mParent, location.getCode(), location.getName());
        if(mCustomerId == null) {
            mParent.setTitle(mParent.getString(R.string.orders_title, location.getName()));
        }
        mView.reload();
    }

    public void fetchItems(int start, int size, String query, IncrementalListAdapter.OnFetchResultListener<Order> listener) throws Exception {

        try {
            List<Order> orders = new ArrayList<Order>();
            OrderResource orderResource = new OrderResource(new MozuApiContext(mTenant, null, null, null));

            String filter = "";
            if (query != null && !query.isEmpty()) {
                filter = "orderNumber eq " + query;
            } else if (mCustomerId != null) {
                filter = "customerAccountId eq " + mCustomerId;
            } else if (mLocationCode != null) {
                filter = "(status eq Accepted or status eq Processing) and items.fulfillmentmethodandlocationcode eq pickup," + mLocationCode;
            }

            OrderCollection orderCollection = orderResource.getOrders(start, size, null, filter, null, null);
            for (int i = 0; i < orderCollection.getItems().size(); ++i) {
                orders.add(orderCollection.getItems().get(i));
            }
            listener.onFetchResult(orders, orderCollection.getStartIndex(), orderCollection.getTotalCount().intValue());
        }
        catch(Exception error) {
            if(!mParent.handleSessionExpired(error)) {
                throw error;
            }
        }
    }

    public void onRefresh() {
        mView.reload();
    }

    public void onOrderSelected(Order order) {
        OrderActivity.start(mParent, order.getId(), order.getOrderNumber());
    }
}
