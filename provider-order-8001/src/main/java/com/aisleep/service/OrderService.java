package com.aisleep.service;

import com.aisleep.pojo.Order;

import java.util.List;

public interface OrderService {
    boolean addOrder();
    Order queryById(Long id);
    List<Order> queryList();
}
