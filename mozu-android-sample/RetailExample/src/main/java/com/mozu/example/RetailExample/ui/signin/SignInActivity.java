package com.mozu.example.RetailExample.ui.signin;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.mozu.api.ApiException;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.Scope;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.model.persistence.Storage;
import com.mozu.example.RetailExample.ui.CommonActivity;
import com.mozu.example.RetailExample.ui.main.MainActivity;
import com.mozu.example.RetailExample.ui.tenantselection.TenantSelectionActivity;

import java.util.List;

public class SignInActivity extends CommonActivity {

    public static void start(Context ctx) {
        Intent intent = new Intent(ctx, SignInActivity.class);
        ctx.startActivity(intent);
    }

    private SignInView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mView = SignInFragment.newInstance();

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(android.R.id.content, mView.asFragment());
        transaction.commit();
    }

    public void onSignInClicked() {
        if(mView.areFieldsCorrectlyFormatted())
        {
            signIn(mView.getUser(), mView.getPass());
        }
    }

    private void signIn(final String user, final String pass)
    {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(R.string.signin_auth_title);
        pd.setMessage(getString(R.string.signin_auth_message));
        pd.setCancelable(false);
        pd.setIndeterminate(true);
        pd.show();

        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                UserAuthInfo userAuthInfo = new UserAuthInfo();
                userAuthInfo.setEmailAddress(user);
                userAuthInfo.setPassword(pass);

                try
                {
                    AuthenticationProfile authProfile = UserAuthenticator.authenticate(userAuthInfo, AuthenticationScope.Tenant, null);
                    Tenant tenant = null;
                    if (authProfile.getActiveScope() != null) {
                        TenantResource tenantResource = new TenantResource();
                        tenant = tenantResource.getTenant(authProfile.getActiveScope().getId());
                    }
                    Storage.INSTANCE.setUserAuthTicket(SignInActivity.this, authProfile.getAuthTicket());
                    Storage.INSTANCE.setTenant(SignInActivity.this, tenant);

                    pd.dismiss();

                    if(tenant == null)
                    {
                        startTenantSelectionActivity(authProfile.getAuthorizedScopes());
                    }
                    else
                    {
                        startMainActivity();
                    }
                }
                catch (final Exception ex)
                {
                    final String message;
                    if(ex instanceof ApiException && "INVALID_CREDENTIALS".equals(((ApiException) ex).getApiError().getErrorCode()))
                    {
                        message = getString(R.string.signin_auth_error_message, getString(R.string.signin_auth_error_message_invalid_credentials));
                    }
                    else
                    {
                        message = getString(R.string.signin_auth_error_message, ex.getLocalizedMessage());
                    }

                    pd.dismiss();
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            new AlertDialog.Builder(SignInActivity.this)
                                    .setMessage(message)
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
                return null;
            }
        }.execute();
    }

    // transitions

    private void startTenantSelectionActivity(List<Scope> allowableScopes) {
        TenantSelectionActivity.start(this, allowableScopes);
        finish();
    }

    private void startMainActivity() {
        MainActivity.start(this);
        finish();
    }
}
