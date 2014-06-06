package com.mozu.android.SalesAssistantUnbranded.ui.orderitem;

import android.app.Activity;

import com.mozu.api.contracts.productruntime.Product;


/**
 * Created by rodrigo_alvarez on 3/24/14.
 */
public interface OrderItemView {
    void install(Activity activity, int resourceId);
    void render(Product item, boolean canMarkForPickup, int stock);
    void clear();
}
