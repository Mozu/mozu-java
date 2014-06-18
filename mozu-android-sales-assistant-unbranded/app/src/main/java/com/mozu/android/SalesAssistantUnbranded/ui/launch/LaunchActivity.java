package com.mozu.android.SalesAssistantUnbranded.ui.launch;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;

import com.mozu.android.SalesAssistantUnbranded.R;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.Scope;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.android.SalesAssistantUnbranded.model.persistence.Storage;
import com.mozu.android.SalesAssistantUnbranded.ui.signin.SignInActivity;
import com.mozu.android.SalesAssistantUnbranded.ui.main.MainActivity;
import com.mozu.android.SalesAssistantUnbranded.ui.tenantselection.TenantSelectionActivity;

import java.util.List;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (AppAuthenticator.getInstance() == null) {
            authenticateApplication();
        } else {
            checkIfLoggedIn();
        }
    }

    //

    private void checkIfLoggedIn() {
        new AsyncTask<Void,Void,Void>() {

            @Override
            protected Void doInBackground(Void... voids) {

                // get current user ticket
                AuthTicket userTicket = Storage.INSTANCE.getUserAuthTicket(LaunchActivity.this);
                if(userTicket == null)
                {
                    startSignInActivity();
                }
                else
                {
                    // get current tenant
                    Tenant tenant = Storage.INSTANCE.getTenant(LaunchActivity.this);

                    try
                    {
                        if(tenant == null)
                        {
                            // session but no tenant, refresh for tenant list or single tenant
                            AuthenticationProfile profile = UserAuthenticator.refreshUserAuthTicket(userTicket);
                            if(profile.getActiveScope() == null)
                            {
                                // no single active tenant, choose one
                                startTenantSelectionActivity(profile.getAuthorizedScopes());
                            }
                            else
                            {
                                // active tenant.  save it, start app
                                TenantResource tenantResource = new TenantResource();
                                tenant = tenantResource.getTenant(profile.getActiveScope().getId());
                                Storage.INSTANCE.setTenant(LaunchActivity.this, tenant);

                                startMainActivity();
                            }
                        }
                        else
                        {
                            // check or renew the session
                            AuthTicket authTicket = UserAuthenticator.ensureAuthTicket(userTicket);
                            AuthenticationProfile profile = UserAuthenticator.refreshUserAuthTicket(userTicket);
                            if(authTicket != null)
                            {
                                // the session is renewed.  Store new auth ticket
                                Storage.INSTANCE.setUserAuthTicket(LaunchActivity.this, authTicket);

                                if(authTicket == null)
                                {
                                    // no single active tenant, choose one
                                    startTenantSelectionActivity(profile.getAuthorizedScopes());
                                }
                                else
                                {
                                    // active tenant.  save it, start app
                                    TenantResource tenantResource = new TenantResource();
                                    tenant = tenantResource.getTenant(profile.getActiveScope().getId());
                                    Storage.INSTANCE.setTenant(LaunchActivity.this, tenant);

                                    startMainActivity();
                                }
                            }
                            else
                            {
                                // the session is current.  start app
                                startMainActivity();
                            }
                        }
                    }
                    catch(final Exception ex)
                    {
                        // something broke.  sign in again.
                        runOnUiThread(new Runnable(){
                            public void run(){
                                new AlertDialog.Builder(LaunchActivity.this)
                                        .setMessage(getString(R.string.app_user_auth_error_message, ex.getLocalizedMessage()))
                                        .setCancelable(false)
                                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                startSignInActivity();
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

    private void authenticateApplication() {

        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(R.string.app_auth_title);
        pd.setMessage(getString(R.string.app_auth_message));
        pd.setCancelable(false);
        pd.setIndeterminate(true);
        pd.show();

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {

                AppAuthInfo appAuthInfo = new AppAuthInfo();
                appAuthInfo.setApplicationId(getString(R.string.app_auth_appid));
                appAuthInfo.setSharedSecret(getString(R.string.app_auth_shared_secret));
                try
                {
                    AppAuthenticator.initialize(appAuthInfo, getString(R.string.service_endpoint));
                    pd.dismiss();
                    checkIfLoggedIn();
                }
                catch(final Exception e)
                {
                    pd.dismiss();
                    runOnUiThread(new Runnable(){
                        public void run(){
                            new AlertDialog.Builder(LaunchActivity.this)
                                    .setMessage(getString(R.string.app_auth_error_message, e.getLocalizedMessage()))
                                    .setCancelable(false)
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            finish();
                                        }
                                    }).show();
                        }
                    });
                }
                return null;
            }
        }.execute();
    }

    // transitions

    private void startSignInActivity() {
        Storage.INSTANCE.clearSession(this);
        SignInActivity.start(this);
        overridePendingTransition(0, 0);
        finish();
    }

    private void startMainActivity() {
        MainActivity.start(this);
        overridePendingTransition(0, 0);
        finish();
    }

    private void startTenantSelectionActivity(List<Scope> allowedScopes) {
        TenantSelectionActivity.start(this, allowedScopes);
        overridePendingTransition(0, 0);
        finish();
    }
}
