package com.mozu.android.SalesAssistantUnbranded.ui.signin;

import android.app.Fragment;

/**
 * Created by rodrigo_alvarez on 2/24/14.
 */
public interface SignInView {

    boolean areFieldsCorrectlyFormatted();
    String getUser();
    String getPass();
    Fragment asFragment();
}
