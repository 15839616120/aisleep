package com.aisleep.controller;

import com.aisleep.pojo.Order;
import com.aisleep.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 提供restful服务
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order/addOrder")
    public boolean addOrder() {
        return orderService.addOrder();
    }

    @GetMapping("/order/queryById/{id}")
    public Order queryById(@PathVariable("id") Long id) {
        return orderService.queryById(id);
    }

    @GetMapping("/order/queryById")
    public List<Order> queryList() {
        return orderService.queryList();
    }
}
