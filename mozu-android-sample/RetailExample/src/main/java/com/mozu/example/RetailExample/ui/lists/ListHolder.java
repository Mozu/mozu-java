package com.mozu.example.RetailExample.ui.lists;

import android.app.Activity;
import android.view.View;

/**
 * Created by rodrigo_alvarez on 3/3/14.
 */
public interface ListHolder<P> {
    View createView(Activity context);
    void fill(P item);
}
