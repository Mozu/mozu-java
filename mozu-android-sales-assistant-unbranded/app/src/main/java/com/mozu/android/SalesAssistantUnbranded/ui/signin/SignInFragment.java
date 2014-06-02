package com.mozu.android.SalesAssistantUnbranded.ui.signin;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.mozu.android.SalesAssistantUnbranded.R;


public class SignInFragment extends Fragment implements SignInView {

    private SignInActivity mPresenter;
    private EditText mUserEditText;
    private EditText mPassEditText;


    public static SignInFragment newInstance() {
        return new SignInFragment();
    }

    public SignInFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_signin, container, false);

        mUserEditText = (EditText)v.findViewById(R.id.user);
        mPassEditText = (EditText)v.findViewById(R.id.password);

        v.findViewById(R.id.signin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputManager = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(view.getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
                onSignInClicked();
            }
        });

        return v;
    }

    public void onSignInClicked() {
        if (mPresenter != null) {
            mPresenter.onSignInClicked();
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mPresenter = (SignInActivity) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must be SignInActivity");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter = null;
    }

    @Override
    public boolean areFieldsCorrectlyFormatted() {
        if(mUserEditText.getText().toString().isEmpty())
        {
            mUserEditText.setError(getString(R.string.signin_error_no_user));
            mUserEditText.requestFocus();
            return false;
        }
        else if(mPassEditText.getText().toString().isEmpty())
        {
            mPassEditText.setError(getString(R.string.signin_error_no_password));
            mPassEditText.requestFocus();
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(mUserEditText.getText().toString()).matches())
        {
            mUserEditText.setError(getString(R.string.signin_error_bad_user));
            mUserEditText.requestFocus();
            return false;
        }
        return true;
    }

    @Override
    public String getUser() {
        return mUserEditText.getText().toString();
    }

    @Override
    public String getPass() {
        return mPassEditText.getText().toString();
    }

    @Override
    public Fragment asFragment() {
        return this;
    }
}
