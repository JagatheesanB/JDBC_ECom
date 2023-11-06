package com.jagadeesh.views;

import com.jagadeesh.models.Order;
import com.jagadeesh.models.User;
import com.jagadeesh.utils.StringUtil;

import java.util.ArrayList;

import static com.jagadeesh.utils.AppOutput.println;
import static com.jagadeesh.utils.UserUtil.getLoggedInUser;

public class OrderPage {
    public void printOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        User user = getLoggedInUser();
        for(Order order:orders)
        {
            if(order.getUser().getId()==user.getId())
            {
                println(order.getId()+". " + order.getProduct().getProductName() +", "+ order.getDate() +", ₹."+order.getProduct().getPrice());
            }
        }
    }
}
