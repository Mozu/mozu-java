package com.mozu.android.SalesAssistantUnbranded.ui.order;

import android.app.Activity;

import com.mozu.android.SalesAssistantUnbranded.model.OrderDetail;

/**
 * Created by rodrigo_alvarez on 3/11/14.
 */
public interface OrderView {
    void install(Activity activity, int resourceId);
    void startLoading();
    void render(OrderDetail order);
}
