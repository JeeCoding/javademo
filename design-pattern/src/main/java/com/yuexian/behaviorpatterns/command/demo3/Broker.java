package com.yuexian.behaviorpatterns.command.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuexian
 * @description
 * @date 2021.4.14 15:38
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}