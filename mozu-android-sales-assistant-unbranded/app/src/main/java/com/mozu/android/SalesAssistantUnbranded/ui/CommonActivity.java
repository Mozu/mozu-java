package com.mozu.android.SalesAssistantUnbranded.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;

import com.mozu.android.SalesAssistantUnbranded.R;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.android.SalesAssistantUnbranded.model.persistence.Storage;
import com.mozu.android.SalesAssistantUnbranded.ui.signin.SignInActivity;

/**
 * Created by rodrigo_alvarez on 3/27/14.
 */
@SuppressWarnings("ALL")
public abstract class CommonActivity extends Activity {

    // Activity

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        slideBack();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        slideForward();
    }

    @Override
    public void startActivityForResult(Intent intent, int code) {
        super.startActivityForResult(intent, code);
        slideForward();
    }

    //

    protected void slideForward() {
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    protected void slideBack() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public boolean handleSessionExpired(Throwable error) {
        // TODO: code here to find out if session has expired.  Unavailable on framework as of 3/24/2014.
//        if(error == null) {
//            runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    new AlertDialog.Builder(CommonActivity.this)
//                            .setMessage(getString(R.string.session_expired_message))
//                            .setCancelable(false)
//                            .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    dialogInterface.dismiss();
//                                    signOut();
//                                }
//                            }).show();
//                }
//            });
//            return true;
//        }
        return false;
    }

    protected void signOut() {
        final AuthTicket ticket = Storage.INSTANCE.getUserAuthTicket(this);
        Storage.INSTANCE.clearSession(this);
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                UserAuthenticator.logout(ticket);
                return null;
            }
        }.execute();
        startSignInActivity();
    }

    protected void startSignInActivity() {
        Storage.INSTANCE.clearSession(this);
        SignInActivity.start(this);
        slideBack();
        finish();
    }
}
