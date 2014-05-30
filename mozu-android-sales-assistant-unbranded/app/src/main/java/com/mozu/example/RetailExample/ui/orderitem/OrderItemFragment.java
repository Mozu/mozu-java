package com.mozu.example.RetailExample.ui.orderitem;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mozu.api.contracts.productruntime.Product;
import com.mozu.api.contracts.productruntime.ProductImage;
import com.mozu.api.contracts.productruntime.ProductProperty;
import com.mozu.api.contracts.productruntime.ProductPropertyValue;
import com.mozu.example.RetailExample.R;

/**
 * Created by rodrigo_alvarez on 3/24/14.
 */
public class OrderItemFragment extends Fragment implements OrderItemView {

    private OrderItemActivity mPresenter;

    // Fragment

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order_item, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mPresenter = (OrderItemActivity)activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must be an OrderActivity");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter = null;
    }

    // OrderItemView

    @Override
    public void install(Activity activity, int resourceId) {
        FragmentManager manager = activity.getFragmentManager();
        FragmentTransaction tran = manager.beginTransaction();
        tran.replace(resourceId, this);
        tran.commit();
        manager.executePendingTransactions();
    }

    @Override
    public void clear() {
        View v = getView();
        if(v == null) {
            return;
        }
        v.findViewById(R.id.content).setVisibility(View.GONE);
    }

    @Override
    public void render(Product item, boolean canMarkForPickup, int stock) {
        View v = getView();
        if(v == null) {
            return;
        }

        ((TextView)v.findViewById(R.id.code)).setText(item.getProductCode());
        ((TextView)v.findViewById(R.id.name)).setText(item.getContent().getProductName());
        ((TextView)v.findViewById(R.id.description)).setText(Html.fromHtml(item.getContent().getProductFullDescription()));

        final LinearLayout images = (LinearLayout)v.findViewById(R.id.images);
        images.removeAllViews();
        for(ProductImage image : item.getContent().getProductImages()) {
            final ImageView img = new ImageView(getActivity());
            img.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            img.setAdjustViewBounds(true);
            images.addView(img);
            mPresenter.loadImage(image.getImageUrl(), new OrderItemActivity.OnImageLoadedHandler() {
                @Override
                public void onImageLoaded(Bitmap bitmap) {
                    img.setImageBitmap(bitmap);
                }
            });
        }

        GridLayout properties = (GridLayout)v.findViewById(R.id.properties);
        properties.removeAllViews();
        properties.setRowCount(item.getProperties().size());
        for(ProductProperty property : item.getProperties()) {
            String value = "";
            if (property.getIsMultiValue()) {
                for(ProductPropertyValue productPropertyValue : property.getValues()) {
                    if (!TextUtils.isEmpty(value))
                        value += ", ";
                    value += getValue(productPropertyValue);
                }
            } else {
                value = getValue(property.getValues().get(0));
            }

            TextView nameView = new TextView(getActivity());
            nameView.setTextSize(14);
            nameView.setText(property.getAttributeDetail().getName());
            nameView.setPadding(0, 0, (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15, getResources().getDisplayMetrics()), 0);
            properties.addView(nameView);
            TextView valueView = new TextView(getActivity());
            valueView.setTextSize(14);
            valueView.setText(value);
            properties.addView(valueView);
        }

        int stockOnline = item.getInventoryInfo().getOnlineStockAvailable() == null ? 0 : item.getInventoryInfo().getOnlineStockAvailable();
        ((TextView)v.findViewById(R.id.inventory)).setText(Html.fromHtml(getString(R.string.order_item_inventory_format, stock, stockOnline)));
        // TODO: missing currency code for price
        ((TextView)v.findViewById(R.id.price)).setText(Html.fromHtml(getString(R.string.order_item_price_format, "", item.getPrice().getPrice())));

        View pickup = v.findViewById(R.id.mark_for_pickup);
        if(canMarkForPickup) {
            pickup.setEnabled(true);
            pickup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mPresenter != null) {
                        mPresenter.onMarkForPickupClicked();
                    }
                }
            });
        }
        else {
            pickup.setEnabled(false);
            pickup.setOnClickListener(null);
        }

        v.findViewById(R.id.content).setVisibility(View.VISIBLE);
    }

    private String getValue(ProductPropertyValue productPropertyValue) {
        if (TextUtils.isEmpty(productPropertyValue.getStringValue())) {
            return productPropertyValue.getValue().toString();
        } else {
            return productPropertyValue.getStringValue();
        }
    }
}
