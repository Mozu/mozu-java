package com.mozu.example.RetailExample.ui.order;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.commerceruntime.fulfillment.*;
import com.mozu.api.contracts.commerceruntime.fulfillment.Package;
import com.mozu.api.contracts.commerceruntime.orders.Order;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;
import com.mozu.api.contracts.commerceruntime.payments.Payment;
import com.mozu.api.contracts.commerceruntime.payments.PaymentAction;
import com.mozu.api.contracts.productadmin.LocationInventory;
import com.mozu.api.contracts.tenant.Catalog;
import com.mozu.api.contracts.tenant.MasterCatalog;
import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.OrderResource;
import com.mozu.api.resources.commerce.catalog.admin.LocationInventoryResource;
import com.mozu.api.resources.commerce.customer.CustomerAccountResource;
import com.mozu.api.resources.commerce.orders.FulfillmentActionResource;
import com.mozu.api.resources.commerce.orders.PaymentResource;
import com.mozu.api.resources.commerce.orders.PickupResource;
import com.mozu.api.security.AuthTicket;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.model.OrderDetail;
import com.mozu.example.RetailExample.model.persistence.Storage;
import com.mozu.example.RetailExample.ui.CommonActivity;
import com.mozu.example.RetailExample.ui.orderitem.OrderItemActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 3/11/14.
 */
public class OrderActivity extends CommonActivity {

    public static void start(Activity ctx, String orderId, int orderNumber) {
        Intent intent = new Intent(ctx, OrderActivity.class);
        intent.putExtra("OrderID", orderId);
        intent.putExtra("OrderNumber", orderNumber);
        ctx.startActivity(intent);
    }

    //

    private OrderDetail mOrder;
    private Integer mCatalogId;
    private Integer mMasterCatalogId;
    private final OrderView mView = new OrderFragment();

    // Activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);

        setTitle(getString(R.string.order_title, getIntent().getIntExtra("OrderNumber", 0)));
        mView.install(this, android.R.id.content);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if(savedInstanceState != null) {
            mOrder = (OrderDetail) savedInstanceState.getSerializable("Order");
        }
    }

    @Override
    protected void onSaveInstanceState (@SuppressWarnings("NullableProblems") Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("Order", mOrder);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_order, menu);
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
    public boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadOrder(getIntent().getStringExtra("OrderID"));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                mOrder = null;
                loadOrder(getIntent().getStringExtra("OrderID"));
            }
        }
    }

    //

    public void onTenderOrderClicked() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(R.string.order_tender_title);
        pd.setMessage(getString(R.string.order_tender_message));
        pd.setCancelable(false);
        pd.setIndeterminate(true);
        pd.show();

        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {

                ApiContext apiContext = new MozuApiContext(mOrder.order.getTenantId(), mOrder.order.getSiteId(), mMasterCatalogId, mCatalogId);

                FulfillmentActionResource fulfillmentActionResource = new FulfillmentActionResource(apiContext);
                PaymentResource paymentResource = new PaymentResource(apiContext);

                try {

                    Double chargeAmount = 0.00;

                    List<String> pickups = new ArrayList<String>();
                    for(Pickup pk : mOrder.order.getPickups()) {
                        if (pk.getStatus().equals("Fulfilled"))
                            continue;
                        pickups.add(pk.getId());
                        for(PickupItem item : pk.getItems()) {
                            for(OrderItem oItem : mOrder.order.getItems()) {
                                if (oItem.getProduct().getProductCode().equals(item.getProductCode())) {
                                    chargeAmount += oItem.getTotal();
                                    break;
                                }
                            }
                        }
                    }

                    FulfillmentAction fulfillmentAction = new FulfillmentAction();
                    fulfillmentAction.setActionName("Pickup");
                    fulfillmentAction.setPickupIds(pickups);
                    fulfillmentActionResource.performFulfillmentAction(fulfillmentAction, mOrder.order.getId());

                    if (chargeAmount > 0) {
                        String paymentId = null;
                        if (mOrder.order.getPayments().size() > 0) {
                            paymentId = getPendingPayment(mOrder.order);
                        }

                        if (paymentId == null){
                            PaymentAction createPaymentAction = new PaymentAction();

                            createPaymentAction.setAmount(chargeAmount);
                            createPaymentAction.setCheckNumber("1");
                            createPaymentAction.setActionName("CreatePayment");
                            createPaymentAction.setCurrencyCode(mOrder.order.getCurrencyCode());
                            BillingInfo billingInfo = new BillingInfo();
                            billingInfo.setPaymentType(mOrder.order.getBillingInfo().getPaymentType());
                            billingInfo.setBillingContact(mOrder.order.getBillingInfo().getBillingContact());
                            billingInfo.setIsSameBillingShippingAddress(true);

                            createPaymentAction.setNewBillingInfo(billingInfo);

                            mOrder.order = paymentResource.createPaymentAction(createPaymentAction, mOrder.order.getId());
                            paymentId = getPendingPayment(mOrder.order);
                        }

                        PaymentAction capturePaymentAction = new PaymentAction();
                        capturePaymentAction.setActionName("CapturePayment");
                        capturePaymentAction.setCheckNumber("1");
                        capturePaymentAction.setAmount(chargeAmount);
                        paymentResource.performPaymentAction(capturePaymentAction,mOrder.order.getId(),paymentId);
                    }

                    pd.dismiss();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mOrder = null;
                            loadOrder(getIntent().getStringExtra("OrderID"));
                        }
                    });

                } catch(final Exception error) {

                    pd.dismiss();

                    if(error instanceof ApiException)

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            new AlertDialog.Builder(OrderActivity.this)
                                    .setMessage(getString(R.string.order_tender_error_message, error.getLocalizedMessage()))
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
                return null;
            }
        }.execute();
    }

    public void onMarkFullOrderForPickupClicked() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(R.string.order_package_title);
        pd.setMessage(getString(R.string.order_package_message));
        pd.setCancelable(false);
        pd.setIndeterminate(true);
        pd.show();

        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {

                final String locationCode = Storage.INSTANCE.getLocationCode(OrderActivity.this);

                try {

                    ApiContext apiContext = new MozuApiContext(mOrder.order.getTenantId(), mOrder.order.getSiteId(), null, null);

                    PickupResource pickupResource = new PickupResource(apiContext);
                    Pickup pickup = new Pickup();
                    List<PickupItem> pickupItems = new ArrayList<PickupItem>();
                    for(OrderItem item : mOrder.order.getItems()) {
                        if(item.getFulfillmentMethod().equals("Pickup")) {
                            boolean found = false;
                            for(Pickup pk : mOrder.order.getPickups()) {
                                if (!pk.getStatus().equals("Fulfilled")) {
                                    for (PickupItem pickupItem : pk.getItems()) {
                                        if (pickupItem.getProductCode().equals(item.getProduct().getProductCode())) {
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (found) {
                                        break;
                                    }
                                }
                            }
                            if(!found) {
                                PickupItem pickupItem = new PickupItem();
                                pickupItem.setProductCode(item.getProduct().getProductCode());
                                pickupItem.setQuantity(item.getQuantity());
                                pickupItems.add(pickupItem);
                            }
                        }
                    }

                    pickup.setFulfillmentLocationCode(locationCode);
                    pickup.setItems(pickupItems);
                    pickupResource.createPickup(pickup, mOrder.order.getId());

                    pd.dismiss();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mOrder = null;
                            loadOrder(getIntent().getStringExtra("OrderID"));
                        }
                    });

                } catch(final Exception error) {

                    pd.dismiss();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            new AlertDialog.Builder(OrderActivity.this)
                                    .setMessage(getString(R.string.order_fulfill_error_message, error.getLocalizedMessage()))
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
                return null;
            }
        }.execute();
    }

    public void onItemClicked(OrderDetail.OrderItemDetail item) {
        OrderItemActivity.start(this, 1, mOrder.order.getId(), mOrder.order.getSiteId(), item.orderItem.getProduct().getProductCode(), item.quantity, item.available, item.fulfillment == OrderDetail.OrderItemDetail.Fulfillment.PICKUP && item.status == OrderDetail.OrderItemDetail.Status.PENDING);
    }

    //

    private String getPendingPayment(Order order) {
        for(Payment payment : order.getPayments()) {
            if ( (payment.getPaymentType().equals("Check") && !payment.getStatus().equals("Pending")) ||
                    (payment.getPaymentType().equals("CreditCard") && !payment.getStatus().equals("Authorized")) ) continue;
            return payment.getId();
        }

        return null;
    }

    private void loadOrder(final String orderId) {
        setProgressBarIndeterminateVisibility(true);
        mView.startLoading();

        if (mOrder != null) {
            mView.render(mOrder);
            setProgressBarIndeterminateVisibility(false);
        } else {
            new AsyncTask<Void, Void, Void>() {

                @Override
                protected Void doInBackground(Void... params) {

                    try {

                        Tenant tenant = Storage.INSTANCE.getTenant(OrderActivity.this);
                        // TODO: call and use ticket Storage.INSTANCE.getUserAuthTicket(OrderActivity.this);
                        MozuApiContext context = new MozuApiContext(tenant, null, null, null);

                        String locationCode = Storage.INSTANCE.getLocationCode(OrderActivity.this);

                        mOrder = new OrderDetail();

                        // get order and account data
                        OrderResource resource = new OrderResource(context);
                        mOrder.order = resource.getOrder(orderId);

                        mOrder.items = new ArrayList<OrderDetail.OrderItemDetail>();
                        mOrder.subtotal = getString(R.string.order_total_format, mOrder.order.getCurrencyCode(), mOrder.order.getSubtotal());
                        mOrder.discount = getString(R.string.order_total_format, mOrder.order.getCurrencyCode(), mOrder.order.getDiscountedTotal());
                        mOrder.shipping = getString(R.string.order_total_format, mOrder.order.getCurrencyCode(), mOrder.order.getShippingTotal());
                        mOrder.handling = getString(R.string.order_total_format, mOrder.order.getCurrencyCode(), mOrder.order.getHandlingTotal());
                        mOrder.tax = getString(R.string.order_total_format, mOrder.order.getCurrencyCode(), mOrder.order.getTaxTotal());
                        mOrder.total = getString(R.string.order_total_format, mOrder.order.getCurrencyCode(), mOrder.order.getTotal());
                        mOrder.canTenderOrder = false;
                        mOrder.hasPendingPickupItems = false;

                        CustomerAccountResource accountResource = new CustomerAccountResource(context);
                        mOrder.account = accountResource.getAccount(mOrder.order.getCustomerAccountId());

                        // get catalog id, master catalog id for inventory

                        mCatalogId = null;
                        for (Site site : tenant.getSites()) {
                            if (site.getId().equals(mOrder.order.getSiteId())) {
                                mCatalogId = site.getCatalogId();
                                break;
                            }
                        }
                        mMasterCatalogId = null;
                        if (mCatalogId != null) {
                            for (MasterCatalog masterCatalog : tenant.getMasterCatalogs()) {
                                for (Catalog catalog : masterCatalog.getCatalogs()) {
                                    if (catalog.getId().equals(mCatalogId)) {
                                        mMasterCatalogId = masterCatalog.getId();
                                        break;
                                    }
                                }
                                if (mMasterCatalogId != null) {
                                    break;
                                }
                            }
                        }
                        if (mMasterCatalogId == null) {
                            throw new Throwable(getString(R.string.error_no_master_catalog));
                        }

                        if (mOrder.order.getFulfillmentStatus().equals("NotFulfilled"))
                            mOrder.fulfillmentStatus = getString(R.string.order_fulfillment_status_not_fulfilled);
                        else if (mOrder.order.getFulfillmentStatus().equals("Fulfilled"))
                            mOrder.fulfillmentStatus = getString(R.string.order_fulfillment_status_fulfilled);
                        else
                            mOrder.fulfillmentStatus = getString(R.string.order_fulfillment_status_partially_fulfilled);
                        // TODO: text coming from the server needs internationalization
                        mOrder.orderStatus = mOrder.order.getStatus();
                        mOrder.paymentStatus = mOrder.order.getPaymentStatus();

                        // get inventory for each item, build item detail list

                        MozuApiContext inventoryContext = new MozuApiContext(tenant, null, mMasterCatalogId, mCatalogId);
                        LocationInventoryResource inventoryResource = new LocationInventoryResource(inventoryContext);
                        for (OrderItem item : mOrder.order.getItems()) {
                            OrderDetail.OrderItemDetail detailItem = new OrderDetail.OrderItemDetail();
                            detailItem.orderItem = item;
                            detailItem.quantity = item.getQuantity();

                            if (TextUtils.isEmpty(item.getProduct().getVariationProductCode())) {
                                detailItem.productCode = item.getProduct().getProductCode();
                            } else {
                                detailItem.productCode = item.getProduct().getVariationProductCode();
                            }

                            try {

                                LocationInventory inventory = inventoryResource.getLocationInventory(DataViewMode.Live, locationCode, detailItem.productCode);
                                detailItem.available = inventory.getStockAvailable();
                                detailItem.reserved = inventory.getStockOnHand() - inventory.getStockAvailable();
                            } catch (Throwable error) {
                                detailItem.available = 0;
                                detailItem.reserved = 0;
                            }

                            if (item.getFulfillmentMethod().equals("Pickup")) {
                                detailItem.fulfillment = OrderDetail.OrderItemDetail.Fulfillment.PICKUP;
                            } else if (item.getFulfillmentMethod().equals("Ship")) {
                                detailItem.fulfillment = OrderDetail.OrderItemDetail.Fulfillment.SHIP;
                            } else {
                                detailItem.fulfillment = OrderDetail.OrderItemDetail.Fulfillment.PENDING;
                                detailItem.status = OrderDetail.OrderItemDetail.Status.PENDING;
                            }

                            if (detailItem.fulfillment == OrderDetail.OrderItemDetail.Fulfillment.PICKUP) {

                                for (Pickup p : mOrder.order.getPickups()) {
                                    boolean found = false;
                                    for (PickupItem pickupItem : p.getItems()) {
                                        if (pickupItem.getProductCode().equals(detailItem.productCode)) {
                                            found = true;
                                            if (p.getStatus().equals("Fulfilled")) {
                                                detailItem.status = OrderDetail.OrderItemDetail.Status.FULFILLED;
                                            } else {
                                                detailItem.status = OrderDetail.OrderItemDetail.Status.READY;
                                                mOrder.canTenderOrder = true;
                                            }
                                            break;
                                        }
                                    }
                                    if (found) {
                                        break;
                                    }
                                }
                                if (detailItem.status == null) {
                                    detailItem.status = OrderDetail.OrderItemDetail.Status.PENDING;
                                    mOrder.hasPendingPickupItems = true;
                                }
                            } else if (detailItem.fulfillment == OrderDetail.OrderItemDetail.Fulfillment.SHIP) {

                                for (Package p : mOrder.order.getPackages()) {
                                    boolean found = false;
                                    for (PackageItem packageItem : p.getItems()) {
                                        if (packageItem.getProductCode().equals(item.getProduct().getProductCode())) {
                                            found = true;
                                            if (p.getStatus().equals("Fulfilled")) {
                                                detailItem.status = OrderDetail.OrderItemDetail.Status.FULFILLED;
                                            } else {
                                                detailItem.status = OrderDetail.OrderItemDetail.Status.READY;
                                            }
                                            break;
                                        }
                                    }
                                    if (found) {
                                        break;
                                    }
                                }
                                if (detailItem.status == null) {
                                    detailItem.status = OrderDetail.OrderItemDetail.Status.PENDING;
                                }
                            }

                            mOrder.items.add(detailItem);
                        }

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mView.render(mOrder);
                            }
                        });
                    } catch (final Throwable error) {

                        if (!handleSessionExpired(error)) {

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    new AlertDialog.Builder(OrderActivity.this)
                                            .setMessage(getString(R.string.order_fetch_error_message, error.getLocalizedMessage()))
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
}
