package com.mozu.example.RetailExample.ui.order;

import android.app.Activity;

import com.mozu.example.RetailExample.model.OrderDetail;

/**
 * Created by rodrigo_alvarez on 3/11/14.
 */
public interface OrderView {
    void install(Activity activity, int resourceId);
    void startLoading();
    void render(OrderDetail order);
}
