package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.Order;

import java.util.ArrayList;

public interface OrderService {
    ArrayList<Order> getOrdersList();
    void addOrder(Order order);
    void deleteOrder(String id);
    ArrayList<Order> getValidateOrdersList();
}
