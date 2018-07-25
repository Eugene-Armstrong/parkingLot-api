package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {

    ArrayList<Order> orders = new ArrayList<>();

    /**
     * 获取orders列表
     */
    @Override
    public ArrayList<Order> getOrdersList() {
        return orders;
    }

    /**
     * 添加order
     */
    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * 删除order
     */
    @Override
    public void deleteOrder(String id) {
        for (int i=0;i<orders.size();i++){
            if(orders.get(i).getId().equals(id)){
                orders.remove(i);
                break;
            }
        }
    }
}
