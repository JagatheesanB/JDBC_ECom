package com.jagadeesh.views;

import com.jagadeesh.models.Order;
import com.jagadeesh.utils.StringUtil;

import java.util.ArrayList;

import static com.jagadeesh.utils.AppOutput.println;

public class AdminOrderPage {
    public void viewOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        for (Order order : orders) {

            println(order.getId() + ". " + order.getProduct().getProductName() + ", "+"Ordered By: "+order.getUser().getEmail()+ ", " + order.getDate() + ", ₹." + order.getProduct().getPrice());
        }
    }
}
