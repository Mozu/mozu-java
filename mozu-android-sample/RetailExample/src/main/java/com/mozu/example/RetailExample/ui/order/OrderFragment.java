package com.mozu.example.RetailExample.ui.order;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mozu.api.contracts.commerceruntime.orders.Order;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.example.RetailExample.R;
import com.mozu.example.RetailExample.model.OrderDetail;

import org.joda.time.DateTime;

/**
 * Created by rodrigo_alvarez on 3/11/14.
 */
public class OrderFragment extends Fragment implements OrderView {

    private OrderActivity mPresenter;

    // Fragment

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mPresenter = (OrderActivity)activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must be an OrderActivity");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter = null;
    }

    // OrderView

    @Override
    public void install(Activity activity, int resourceId) {

        FragmentManager manager = activity.getFragmentManager();
        FragmentTransaction tran = manager.beginTransaction();
        tran.replace(resourceId, this);
        tran.commit();
        manager.executePendingTransactions();
    }

    @Override
    public void startLoading() {
        View v = getView();
        if(v == null) {
            return;
        }

        v.findViewById(R.id.content).setVisibility(View.GONE);
    }

    @Override
    public void render(OrderDetail detail) {

        View v = getView();
        if(v == null) {
            return;
        }

        CustomerAccount account = detail.account;

        TextView customerName = (TextView) v.findViewById(R.id.name);
        String firstName = account.getFirstName();
        String lastName = account.getLastName();
        if((firstName == null || lastName == null) && account.getContacts() != null && !account.getContacts().isEmpty())
        {
            firstName = account.getContacts().get(0).getFirstName();
            lastName = account.getContacts().get(0).getLastNameOrSurname();
        }
        customerName.setText(getString(R.string.customer_name_format, firstName, lastName));

        ((TextView)v.findViewById(R.id.name)).setText(getString(R.string.customer_name_format, firstName, lastName));

        String email = account.getEmailAddress();
        if(email == null && account.getContacts() != null && !account.getContacts().isEmpty())
        {
            email = account.getContacts().get(0).getEmail();
        }
        ((TextView)v.findViewById(R.id.email)).setText(email);

        Order order = detail.order;

        ((TextView)v.findViewById(R.id.order_number)).setText(String.valueOf(order.getOrderNumber()));

        TextView address = (TextView)v.findViewById(R.id.address);
        if (order.getBillingInfo() != null && order.getBillingInfo().getBillingContact() != null) {
            Contact contact = order.getBillingInfo().getBillingContact();
            address.setText(getString(R.string.customer_address_format, contact.getAddress().getAddress1(), contact.getAddress().getCityOrTown(), contact.getAddress().getStateOrProvince(), contact.getAddress().getPostalOrZipCode()));
        } else {
            address.setText("");
        }

        ((TextView)v.findViewById(R.id.customer_since)).setText(Html.fromHtml(getString(R.string.customer_since_format, new DateTime(account.getAuditInfo().getCreateDate()).toString("MM/dd/yyyy"))));
        TextView lifetimeValue = ((TextView)v.findViewById(R.id.lifetime_value));
        if(account.getCommerceSummary().getTotalOrderAmount().getAmount() == null) {
            lifetimeValue.setText(Html.fromHtml(getString(R.string.customer_lifetime_value_format, getString(R.string.not_available), "")));
        } else {
            lifetimeValue.setText(Html.fromHtml(getString(R.string.customer_lifetime_value_format, account.getCommerceSummary().getTotalOrderAmount().getCurrencyCode(), String.format("%.02f", account.getCommerceSummary().getTotalOrderAmount().getAmount()))));
        }

        ((TextView)v.findViewById(R.id.order_status)).setText(detail.orderStatus);
        ((TextView)v.findViewById(R.id.fulfillment_status)).setText(detail.fulfillmentStatus);
        ((TextView)v.findViewById(R.id.payment_status)).setText(detail.paymentStatus);

        LinearLayout itemsPanel = (LinearLayout)v.findViewById(R.id.items);
        itemsPanel.removeAllViews();
        for(final OrderDetail.OrderItemDetail item : detail.items) {

            View itemView = getActivity().getLayoutInflater().inflate(R.layout.item_order_item, null);
            ((TextView)itemView.findViewById(R.id.sku)).setText(item.productCode);
            ((TextView)itemView.findViewById(R.id.name)).setText(item.orderItem.getProduct().getName());

            String fulfillment;
            String status = null;
            int statusColor = 0;
            if (item.fulfillment == OrderDetail.OrderItemDetail.Fulfillment.PICKUP) {
                fulfillment = getString(R.string.order_fulfillment_pickup);
                if(item.status == OrderDetail.OrderItemDetail.Status.FULFILLED) {
                    status = getString(R.string.order_fulfillment_picked_up);
                    statusColor = getResources().getColor(android.R.color.black);
                }
            }
            else if(item.fulfillment == OrderDetail.OrderItemDetail.Fulfillment.SHIP) {
                fulfillment = getString(R.string.order_fulfillment_ship);
                if(item.status == OrderDetail.OrderItemDetail.Status.FULFILLED) {
                    status = getString(R.string.order_fulfillment_shipped);
                    statusColor = getResources().getColor(android.R.color.black);
                }
            }
            else {
                fulfillment = "";
            }
            if(status == null) {
                if(item.status == OrderDetail.OrderItemDetail.Status.READY) {
                    status = getString(R.string.order_fulfillment_ready);
                    statusColor = getResources().getColor(android.R.color.holo_green_light);
                } else {
                    status = getString(R.string.order_fulfillment_pending);
                    statusColor = getResources().getColor(android.R.color.holo_orange_light);
                }
            }
            ((TextView)itemView.findViewById(R.id.fulfillment)).setText(fulfillment + ": " + status);
            itemView.findViewById(R.id.status_color).setBackgroundColor(statusColor);

            if(item.reserved != null && item.reserved > 0) {
                ((TextView) itemView.findViewById(R.id.availability)).setText(getString(R.string.order_item_availability_reserved_format, item.quantity, item.available, item.reserved));
            } else {
                ((TextView) itemView.findViewById(R.id.availability)).setText(getString(R.string.order_item_availability_format, item.quantity, item.available));
            }

            itemView.findViewById(R.id.item).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mPresenter != null) {
                        mPresenter.onItemClicked(item);
                    }
                }
            });

            itemsPanel.addView(itemView);
        }

        ((TextView)v.findViewById(R.id.subtotal)).setText(detail.subtotal);
        ((TextView)v.findViewById(R.id.discount)).setText(detail.discount);
        ((TextView)v.findViewById(R.id.shipping)).setText(detail.shipping);
        ((TextView)v.findViewById(R.id.handling)).setText(detail.handling);
        ((TextView)v.findViewById(R.id.tax)).setText(detail.tax);
        ((TextView)v.findViewById(R.id.total)).setText(detail.total);

        Button button = (Button)v.findViewById(R.id.mark_for_pickup);
        if(detail.hasPendingPickupItems) {
            button.setEnabled(true);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mPresenter != null) {
                        mPresenter.onMarkFullOrderForPickupClicked();
                    }
                }
            });
        } else {
            button.setEnabled(false);
            button.setOnClickListener(null);
        }

        button = (Button)v.findViewById(R.id.tender_sale);
        if(detail.canTenderOrder) {
            button.setEnabled(true);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mPresenter != null) {
                        mPresenter.onTenderOrderClicked();
                    }
                }
            });
        } else {
            button.setEnabled(false);
            button.setOnClickListener(null);
        }

        v.findViewById(R.id.content).setVisibility(View.VISIBLE);
    }
}

