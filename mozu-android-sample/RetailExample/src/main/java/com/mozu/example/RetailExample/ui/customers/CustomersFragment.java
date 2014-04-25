package com.mozu.example.RetailExample.ui.customers;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.ui.lists.IncrementalListAdapter;
import com.mozu.example.RetailExample.ui.lists.ListHolder;

/**
 * Created by rodrigo_alvarez on 2/27/14.
 */
public class CustomersFragment extends Fragment implements CustomersView {

    private CustomersPresenter mPresenter;
    private String mCurrentQuery = "";
    private IncrementalListAdapter<CustomerAccount> mListAdapter;
    private EditText mSearchEdit;

    //

    private class CustomerHolder implements ListHolder<CustomerAccount> {

        TextView mFirstNameView;
        TextView mLastNameView;
        TextView mEmailView;

        @Override
        public View createView(Activity context) {
            View v = context.getLayoutInflater().inflate(R.layout.item_customers, null);
            mFirstNameView = (TextView)v.findViewById(R.id.first_name);
            mLastNameView = (TextView)v.findViewById(R.id.last_name);
            mEmailView = (TextView)v.findViewById(R.id.email);
            return v;
        }

        @Override
        public void fill(CustomerAccount item) {
            if(item == null) {
                mFirstNameView.setText("...");
                mLastNameView.setText("");
                mEmailView.setText("");
            } else {
                String firstName = item.getFirstName();
                String lastName = item.getLastName();
                if((firstName == null || lastName == null) && item.getContacts() != null && !item.getContacts().isEmpty())
                {
                    firstName = item.getContacts().get(0).getFirstName();
                    lastName = item.getContacts().get(0).getLastNameOrSurname();
                }

                mFirstNameView.setText(firstName);
                mLastNameView.setText(lastName);

                String email = item.getEmailAddress();
                if(email == null && item.getContacts() != null && !item.getContacts().isEmpty())
                {
                    email = item.getContacts().get(0).getEmail();
                }

                mEmailView.setText(email);
            }
        }
    }

    //

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setProgressBarIndeterminateVisibility(false);

        mListAdapter = new IncrementalListAdapter<CustomerAccount>(getActivity(), 50) {
            @Override
            protected void onFirstRequestStart() {
                if(mPresenter == null) {
                    return;
                }

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        getActivity().setProgressBarIndeterminateVisibility(true);
                    }
                });
            }

            @Override
            protected void onLastRequestEnd() {
                if(mPresenter == null) {
                    return;
                }

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        getActivity().setProgressBarIndeterminateVisibility(false);
                    }
                });
            }

            @Override
            protected ListHolder<CustomerAccount> createNewListHolder() {
                return new CustomerHolder();
            }

            @Override
            protected void fetchItems(int start, int size, OnFetchResultListener<CustomerAccount> listener) throws Exception {
                mPresenter.fetchItems(start, size, mCurrentQuery, listener);
            }
        };

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_customers, container, false);

        v.findViewById(R.id.search_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelSearch();
            }
        });

        mSearchEdit = (EditText)v.findViewById(R.id.search_query);
        mSearchEdit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_NULL && event.getAction() == KeyEvent.ACTION_DOWN) {
                    if(!mSearchEdit.getText().toString().trim().equals(mCurrentQuery)) {
                        mCurrentQuery = mSearchEdit.getText().toString().trim();
                        reload();
                    }
                    return true;
                }
                return false;
            }
        });

        ListView listView = (ListView)v.findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mPresenter.onCustomerAccountSelected((CustomerAccount) mListAdapter.getItem(i));
            }
        });
        listView.setAdapter(mListAdapter);

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_customers, menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        if(item.getItemId() == R.id.refresh) {
            mPresenter.onRefresh();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            CustomersPresenter.HasCustomersPresenter hasCustomersPresenter = (CustomersPresenter.HasCustomersPresenter) activity;
            mPresenter = hasCustomersPresenter.getCustomersPresenter();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement CustomersPresenter.HasCustomersPresenter");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter = null;
    }

    // CustomersView

    @Override
    public void reload() {
        mListAdapter.initialFetch();
    }

    @Override
    public Fragment asFragment() {
        return this;
    }

    //

    private void cancelSearch() {
        String text = mSearchEdit.getText().toString();
        if(!text.isEmpty()) {
            mSearchEdit.setText("");
            mCurrentQuery = "";
            hideKeyboard();
            if(!text.trim().isEmpty()) {
                reload();
            }
        }
    }

    private void hideKeyboard() {

        InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mSearchEdit.getWindowToken(), 0);
    }
}
