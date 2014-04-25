package com.mozu.example.RetailExample.ui.orderitem;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.commerceruntime.fulfillment.Pickup;
import com.mozu.api.contracts.commerceruntime.fulfillment.PickupItem;
import com.mozu.api.contracts.productruntime.Product;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.catalog.storefront.ProductResource;
import com.mozu.api.resources.commerce.orders.PickupResource;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.model.persistence.Storage;
import com.mozu.example.RetailExample.ui.CommonActivity;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 3/24/14.
 */
public class OrderItemActivity extends CommonActivity {

    public interface OnImageLoadedHandler {
        void onImageLoaded(Bitmap bitmap);
    }

    //

    public static void start(Activity ctx, int tag, String orderId, Integer siteId, String productCode, Integer quantity, Integer stock, boolean canMarkForPickup) {
        Intent intent = new Intent(ctx, OrderItemActivity.class);
        intent.putExtra("SiteId", siteId);
        intent.putExtra("OrderId", orderId);
        intent.putExtra("ProductCode", productCode);
        intent.putExtra("Quantity", quantity);
        intent.putExtra("CanMarkForPickup", canMarkForPickup);
        intent.putExtra("Stock", stock);
        ctx.startActivityForResult(intent, tag);
    }

    //

    private final OrderItemView mView = new OrderItemFragment();
    private int mSiteId;
    private String mProductCode;
    private int mQuantity;
    private int mStock;
    private Integer mImagesInFlight = 0;
    private final Object mImagesInFlightLock = new Object();

    // Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);

        mView.install(this, android.R.id.content);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onStart() {
        super.onStart();

        mSiteId = getIntent().getIntExtra("SiteId", 0);
        mProductCode = getIntent().getStringExtra("ProductCode");
        mQuantity = getIntent().getIntExtra("Quantity", 0);
        mStock = getIntent().getIntExtra("Stock", 0);
        final boolean canMarkForPickup = getIntent().getBooleanExtra("CanMarkForPickup", false);
        final Tenant tenant = Storage.INSTANCE.getTenant(this);

        mView.clear();
        setProgressBarIndeterminateVisibility(true);
        new AsyncTask<Void, Void, Product>() {
            @Override
            protected Product doInBackground(Void... params) {

                try {
                    ApiContext apiContext = new MozuApiContext(tenant.getId(), mSiteId, null, null);
                    ProductResource productResource = new ProductResource(apiContext);
                    Product product = productResource.getProduct(mProductCode);
                    return product;
                }
                catch(final Throwable error) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            new AlertDialog.Builder(OrderItemActivity.this)
                                    .setMessage(getString(R.string.order_item_fetch_error_message, error.getLocalizedMessage()))
                                    .setCancelable(false)
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            dialogInterface.dismiss();
                                        }
                                    }).show();
                        }
                    });
                    return null;
                }
            }

            @Override
            protected void onPostExecute(Product result) {
                setProgressBarIndeterminateVisibility(false);
                mView.render(result, canMarkForPickup, mStock);

            }
        }.execute();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_order_item, menu);
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

    // OrderItemActivity

    public void onMarkForPickupClicked() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(R.string.order_package_title);
        pd.setMessage(getString(R.string.order_package_message));
        pd.setCancelable(false);
        pd.setIndeterminate(true);
        pd.show();

        final Tenant tenant = Storage.INSTANCE.getTenant(this);

        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {

                final String locationCode = Storage.INSTANCE.getLocationCode(OrderItemActivity.this);

                try {

                    ApiContext apiContext = new MozuApiContext(tenant.getId(), mSiteId, null, null);

                    PickupResource pickupResource = new PickupResource(apiContext);
                    Pickup pickup = new Pickup();
                    List<PickupItem> pickupItems = new ArrayList<PickupItem>();
                    PickupItem pickupItem = new PickupItem();
                    pickupItem.setProductCode(mProductCode);
                    pickupItem.setQuantity(mQuantity);
                    pickupItems.add(pickupItem);

                    pickup.setFulfillmentLocationCode(locationCode);
                    pickup.setItems(pickupItems);
                    pickupResource.createPickup(pickup, getIntent().getStringExtra("OrderId"));

                    pd.dismiss();

                    setResult(RESULT_OK);
                    onBackPressed();

                } catch(final Exception error) {

                    pd.dismiss();

                    if(!handleSessionExpired(error)) {

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                new AlertDialog.Builder(OrderItemActivity.this)
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
                }
                return null;
            }
        }.execute();
    }

    public void loadImage(String url, final OnImageLoadedHandler handler) {
        synchronized (mImagesInFlightLock) {
            if(mImagesInFlight == 0) {
                setProgressBarIndeterminateVisibility(true);
            }

            String imageUrl = "https://" + url.substring(2);
            new AsyncTask<String,Void,Bitmap>() {

                @Override
                protected Bitmap doInBackground(String... params) {
                    try {
                        URL url = new URL(params[0]);
                        return BitmapFactory.decodeStream(url.openConnection().getInputStream());
                    } catch (IOException e) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(OrderItemActivity.this, R.string.order_item_picture_fetch_error_message, Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                    return null;
                }

                @Override
                protected void onPostExecute(Bitmap bitmap) {
                    if(bitmap != null) {
                        handler.onImageLoaded(bitmap);
                    }
                    synchronized (mImagesInFlightLock) {
                        --mImagesInFlight;
                        if(mImagesInFlight == 0) {
                            setProgressBarIndeterminateVisibility(false);
                        }
                    }
                }
            }.execute(imageUrl);

            ++mImagesInFlight;
        }
    }
}
