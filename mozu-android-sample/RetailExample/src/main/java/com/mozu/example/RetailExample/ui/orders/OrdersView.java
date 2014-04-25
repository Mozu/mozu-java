package com.mozu.example.RetailExample.ui.orders;

import android.app.Fragment;

import com.mozu.api.contracts.tenant.Tenant;

/**
 * Created by rodrigo_alvarez on 2/27/14.
 */
public interface OrdersView {
    void setSimple(boolean simple);
    void reload();
    void setTenant(Tenant tenant);
    Fragment asFragment();
}
