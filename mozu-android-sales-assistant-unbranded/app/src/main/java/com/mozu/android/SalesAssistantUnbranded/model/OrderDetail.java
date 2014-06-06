package com.mozu.android.SalesAssistantUnbranded.model;

import com.mozu.api.contracts.commerceruntime.orders.Order;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;
import com.mozu.api.contracts.customer.CustomerAccount;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by rodrigo_alvarez on 3/21/14.
 */
public class OrderDetail implements Serializable {

    public static class OrderItemDetail implements Serializable {

        public static enum Fulfillment { PENDING, PICKUP, SHIP }
        public static enum Status { PENDING, READY, FULFILLED }

        public String productCode;
        public OrderItem orderItem;
        public Fulfillment fulfillment;
        public Integer quantity;
        public Integer available;
        public Integer reserved;
        public Status status;
    }

    public boolean canTenderOrder;
    public boolean hasPendingPickupItems;

    public Order order;
    public CustomerAccount account;
    public ArrayList<OrderItemDetail> items;

    public String orderStatus;
    public String paymentStatus;
    public String fulfillmentStatus;

    public String subtotal;
    public String discount;
    public String shipping;
    public String handling;
    public String tax;
    public String total;
}
