package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.Order;
import com.oocl.parkinglotapi.serviceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderServiceImpl;

    /**
     * 获取orders列表
     */
    @GetMapping("")
    public ArrayList<Order> getOrdersList(){
        return orderServiceImpl.getOrdersList();
    }

    /**
     * 添加order
     */
    @PostMapping("")
    public ArrayList<Order> addOrder(@RequestBody Order order){
        orderServiceImpl.addOrder(order);
        return orderServiceImpl.getOrdersList();
    }

    /**
     * 删除order
     */
    @DeleteMapping("{id}")
    public ArrayList<Order> deleteOrder(@PathVariable String id){
        orderServiceImpl.deleteOrder(id);
        return orderServiceImpl.getOrdersList();
    }

    /**
     * 获取可抢order列表
     */
    @PutMapping("")
    public ArrayList<Order> getValidateOrdersList(){
        return orderServiceImpl.getValidateOrdersList();
    }
}
