package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.Order;
import com.oocl.parkinglotapi.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderServiceImpl;

    @GetMapping("")
    public ArrayList<Order> getOrdersList(){
        return orderServiceImpl.getOrdersList();
    }

    @PostMapping("")
    public ArrayList<Order> addOrder(@RequestBody Order order){
        orderServiceImpl.addOrder(order);
        return orderServiceImpl.getOrdersList();
    }

    @DeleteMapping("{id}")
    public ArrayList<Order> deleteOrder(@PathVariable String id){
        orderServiceImpl.deleteOrder(id);
        return orderServiceImpl.getOrdersList();
    }
}
