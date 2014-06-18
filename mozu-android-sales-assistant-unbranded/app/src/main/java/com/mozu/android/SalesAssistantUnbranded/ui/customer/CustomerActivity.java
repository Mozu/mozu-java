package com.mozu.android.SalesAssistantUnbranded.ui.customer;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.mozu.android.SalesAssistantUnbranded.R;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.customer.CustomerAccountResource;
import com.mozu.android.SalesAssistantUnbranded.model.persistence.Storage;
import com.mozu.android.SalesAssistantUnbranded.ui.CommonActivity;
import com.mozu.android.SalesAssistantUnbranded.ui.orders.OrdersPresenter;

public class CustomerActivity extends CommonActivity implements OrdersPresenter.HasOrdersPresenter {

    public static void start(Activity ctx, Integer customerId) {
        Intent intent = new Intent(ctx, CustomerActivity.class);
        intent.putExtra("CustomerId", customerId);
        ctx.startActivity(intent);
    }

    //

    private final CustomerView mView = new CustomerFragment();
    private final OrdersPresenter mHistoryPresenter = new OrdersPresenter();
    private Integer mCustomerId;
    private CustomerAccount mCustomer;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_customer);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if(savedInstanceState != null) {
            mCustomer = (CustomerAccount)savedInstanceState.getSerializable("Customer");
        }

        mView.install(this, R.id.customer_info);
        mCustomerId = getIntent().getIntExtra("CustomerId", 0);
        mHistoryPresenter.install(this, R.id.customer_history, mCustomerId);
    }

    @Override
    protected void onSaveInstanceState (@SuppressWarnings("NullableProblems") Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("Customer", mCustomer);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_customer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.signout) {
            signOut();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadCustomer();
    }

    @Override
    public boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    //

    private void loadCustomer() {
        setProgressBarIndeterminateVisibility(true);
        mView.clear();

        if(mCustomer != null) {
            mView.render(mCustomer);
            setProgressBarIndeterminateVisibility(false);
        } else {

            new AsyncTask<Void, Void, Void>() {

                @Override
                protected Void doInBackground(Void... params) {

                    try {

                        Tenant tenant = Storage.INSTANCE.getTenant(CustomerActivity.this);
                        // TODO: call and use ticket Storage.INSTANCE.getUserAuthTicket(CustomerActivity.this);
                        CustomerAccountResource resource = new CustomerAccountResource(new MozuApiContext(tenant, null, null, null));

                        mCustomer = resource.getAccount(mCustomerId);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mView.render(mCustomer);
                            }
                        });
                    } catch (final Throwable error) {

                        if (!handleSessionExpired(error)) {

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    new AlertDialog.Builder(CustomerActivity.this)
                                            .setMessage(getString(R.string.customer_fetch_error_message, error.getLocalizedMessage()))
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
                    } finally {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                setProgressBarIndeterminateVisibility(false);
                            }
                        });
                    }

                    return null;
                }
            }.execute();
        }
    }

    // HasOrdersPresenter

    @Override
    public OrdersPresenter getOrdersPresenter() {
        return mHistoryPresenter;
    }
}
