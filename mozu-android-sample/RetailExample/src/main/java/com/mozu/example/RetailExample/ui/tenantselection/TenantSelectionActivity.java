package com.mozu.example.RetailExample.ui.tenantselection;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.mozu.api.ApiException;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.Scope;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.model.persistence.Storage;
import com.mozu.example.RetailExample.ui.CommonActivity;
import com.mozu.example.RetailExample.ui.main.MainActivity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 2/24/14.
 */
public class TenantSelectionActivity extends CommonActivity {

    public static void start(Context context, List<Scope> allowedScopes)
    {
        Intent intent = new Intent(context, TenantSelectionActivity.class);
        ArrayList<Integer> allowedScopeIds = new ArrayList<Integer>();
        ArrayList<String> allowedScopeNames = new ArrayList<String>();
        for(Scope scope : allowedScopes)
        {
            allowedScopeIds.add(scope.getId());
            allowedScopeNames.add(scope.getName());
        }
        intent.putExtra("allowedScopeIds", allowedScopeIds);
        intent.putExtra("allowedScopeNames", allowedScopeNames);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        @SuppressWarnings("unchecked") ArrayList<Integer> allowedScopeIds = (ArrayList<Integer>)getIntent().getSerializableExtra("allowedScopeIds");
        @SuppressWarnings("unchecked") ArrayList<String> allowedScopeNames = (ArrayList<String>)getIntent().getSerializableExtra("allowedScopeNames");
        LinkedHashMap<Integer, String> allowedScopes = new LinkedHashMap<Integer, String>();
        for(int i=0; i<allowedScopeIds.size(); ++i)
        {
            allowedScopes.put(allowedScopeIds.get(i), allowedScopeNames.get(i));
        }

        TenantSelectionView view = TenantSelectionFragment.newInstance(allowedScopes);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(android.R.id.content, view.asFragment());
        transaction.commit();
    }

    //

    public void onTenantSelected(Integer id) {

        AuthTicket ticket = Storage.INSTANCE.getUserAuthTicket(this);
        if(ticket == null)
        {
            // this should never happen.
            startSignInActivity();
        }
        else
        {
            refreshAuthTicketWithTenant(ticket, id);
        }
    }

    private void refreshAuthTicketWithTenant(final AuthTicket ticket, final Integer tenantId)
    {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(R.string.tenant_signin_auth_title);
        pd.setMessage(getString(R.string.tenant_signin_auth_message));
        pd.setCancelable(false);
        pd.setIndeterminate(true);
        pd.show();

        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                try
                {
                    ticket.setScope(AuthenticationScope.Tenant);
                    AuthenticationProfile authProfile = UserAuthenticator.refreshUserAuthTicket(ticket, tenantId);
                    if (authProfile.getActiveScope() != null) {
                        TenantResource tenantResource = new TenantResource();
                        Tenant tenant = tenantResource.getTenant(authProfile.getActiveScope().getId());
                        Storage.INSTANCE.setUserAuthTicket(TenantSelectionActivity.this, authProfile.getAuthTicket());
                        Storage.INSTANCE.setTenant(TenantSelectionActivity.this, tenant);
                        startMainActivity();
                    }
                    else
                    {
                        runOnUiThread(new Runnable(){
                            public void run(){
                                new AlertDialog.Builder(TenantSelectionActivity.this)
                                        .setMessage(R.string.tenant_auth_error_unknown)
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

                    pd.dismiss();
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
                            new AlertDialog.Builder(TenantSelectionActivity.this)
                                    .setMessage(message)
                                    .setCancelable(false)
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            dialogInterface.dismiss();
                                            startSignInActivity();
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

    private void startMainActivity() {
        MainActivity.start(this);
        finish();
    }
}
