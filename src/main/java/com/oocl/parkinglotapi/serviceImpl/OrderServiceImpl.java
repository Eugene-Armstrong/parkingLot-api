package com.oocl.parkinglotapi.serviceImpl;

import com.oocl.parkinglotapi.pojo.Order;
import com.oocl.parkinglotapi.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {

    ArrayList<Order> orders = new ArrayList<>();
    {
        Order order = new Order("0",true,"粤12345","1");
        orders.add(order);
    }

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

    /**
     * 获取可抢order列表
     */
    @Override
    public ArrayList<Order> getValidateOrdersList() {
        ArrayList<Order> validateOrders = new ArrayList<>();
        for (Order order:orders){
            if (order.isValidate()){
                validateOrders.add(order);
            }
        }
        return validateOrders;
    }
}
