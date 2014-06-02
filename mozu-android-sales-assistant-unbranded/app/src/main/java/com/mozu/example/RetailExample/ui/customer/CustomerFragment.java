package com.mozu.example.RetailExample.ui.customer;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.example.RetailExample.R;

import org.joda.time.DateTime;

/**
 * Created by rodrigo_alvarez on 3/10/14.
 */
public class CustomerFragment extends Fragment implements CustomerView {

    View mContentFrame;


    // Fragment

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_customer, container, false);
        mContentFrame = v.findViewById(R.id.content_frame);
        return v;
    }

    // CustomerView

    @Override
    public void install(Activity activity, int containerId)
    {
        FragmentManager manager = activity.getFragmentManager();
        FragmentTransaction tran = manager.beginTransaction();
        tran.replace(containerId, this);
        tran.commit();
        manager.executePendingTransactions();
    }

    @Override
    public void clear() {
        mContentFrame.setVisibility(View.GONE);
    }

    @Override
    public void render(CustomerAccount customer) {

        View v = getView();
        if(v == null) {
            return;
        }

        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        if((firstName == null || lastName == null) && customer.getContacts() != null && !customer.getContacts().isEmpty())
        {
            firstName = customer.getContacts().get(0).getFirstName();
            lastName = customer.getContacts().get(0).getLastNameOrSurname();
        }

        ((TextView)v.findViewById(R.id.name)).setText(getString(R.string.customer_name_format, firstName, lastName));

        String email = customer.getEmailAddress();
        if(email == null && customer.getContacts() != null && !customer.getContacts().isEmpty())
        {
            email = customer.getContacts().get(0).getEmail();
        }
        ((TextView)v.findViewById(R.id.email)).setText(email);

        TextView address = (TextView)v.findViewById(R.id.address);
        if (customer.getContacts().size() > 0) {
            CustomerContact contact = customer.getContacts().get(0);
            address.setText(getString(R.string.customer_address_format, contact.getAddress().getAddress1(), contact.getAddress().getCityOrTown(), contact.getAddress().getStateOrProvince(), contact.getAddress().getPostalOrZipCode()));
        } else {
            address.setText("");
        }

        ((TextView)v.findViewById(R.id.customer_since)).setText(Html.fromHtml(getString(R.string.customer_since_format, new DateTime(customer.getAuditInfo().getCreateDate()).toString("MM/dd/yyyy"))));
        ((TextView)v.findViewById(R.id.lifetime_value)).setText(String.format("%s %.02f", customer.getCommerceSummary().getTotalOrderAmount().getCurrencyCode(), customer.getCommerceSummary().getTotalOrderAmount().getAmount()));

        TextView totalVisits = (TextView)v.findViewById(R.id.total_visits);
        String visits = String.valueOf(customer.getCommerceSummary().getVisitsCount());
        if(customer.getCommerceSummary().getVisitsCount() == null || "0".equals(visits)) {
            visits = getString(R.string.none);
        }
        totalVisits.setText(visits);

        TextView totalOrders = (TextView)v.findViewById(R.id.total_orders);
        if (customer.getCommerceSummary().getOrderCount() != null)
            totalOrders.setText(customer.getCommerceSummary().getOrderCount().toString());
        else
            totalOrders.setText("0");

        mContentFrame.setVisibility(View.VISIBLE);
    }
}
