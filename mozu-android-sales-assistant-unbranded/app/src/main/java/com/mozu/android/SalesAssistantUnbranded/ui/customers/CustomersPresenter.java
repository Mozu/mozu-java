package com.mozu.android.SalesAssistantUnbranded.ui.customers;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.mozu.android.SalesAssistantUnbranded.R;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAccountCollection;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.customer.CustomerAccountResource;
import com.mozu.android.SalesAssistantUnbranded.model.persistence.Storage;
import com.mozu.android.SalesAssistantUnbranded.ui.CommonActivity;
import com.mozu.android.SalesAssistantUnbranded.ui.customer.CustomerActivity;
import com.mozu.android.SalesAssistantUnbranded.ui.lists.IncrementalListAdapter;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 2/27/14.
 */
public class CustomersPresenter {

    public static interface HasCustomersPresenter {
        CustomersPresenter getCustomersPresenter();
    }

    //

    private Tenant mTenant;
    private final CustomersView mView = new CustomersFragment();
    private CommonActivity mParent;

    //

    public void install(CommonActivity activity, int containerId)
    {
        mParent = activity;

        mTenant = Storage.INSTANCE.getTenant(mParent);
        mParent.setTitle(R.string.customers_title);

        FragmentManager manager = mParent.getFragmentManager();
        FragmentTransaction tran = manager.beginTransaction();
        tran.replace(containerId, mView.asFragment());
        tran.commit();
        manager.executePendingTransactions();

        mView.reload();
    }

    //

    public void fetchItems(int start, int size, String query, IncrementalListAdapter.OnFetchResultListener<CustomerAccount> listener) throws Exception {
        try {
            List<CustomerAccount> orders = new ArrayList<CustomerAccount>();
            CustomerAccountResource resource = new CustomerAccountResource(new MozuApiContext(mTenant, null, null, null));

            String filter = null;
            if (query != null && !query.isEmpty()) {
                filter = URLEncoder.encode("firstName cont '" + query + "' or lastName cont '" + query + "' or emailAddress cont '" + query + "'", "UTF-8");
            }

            CustomerAccountCollection orderCollection = resource.getAccounts(start, size, null, filter, null, null, null, null);
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

    public void onCustomerAccountSelected(CustomerAccount account) {
        CustomerActivity.start(mParent, account.getId());
    }
}
