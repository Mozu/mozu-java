package com.mozu.android.SalesAssistantUnbranded.ui.customer;

import android.app.Activity;

import com.mozu.api.contracts.customer.CustomerAccount;

/**
 * Created by rodrigo_alvarez on 3/10/14.
 */
public interface CustomerView {
    void install(Activity activity, int containerId);
    void clear();
    void render(CustomerAccount account);
}
