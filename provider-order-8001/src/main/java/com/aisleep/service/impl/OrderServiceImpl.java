package com.aisleep.service.impl;

import com.aisleep.mapper.OrderMapper;
import com.aisleep.pojo.Order;
import com.aisleep.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Service层
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public boolean addOrder() {
        return orderMapper.addOrder();
    }

    public Order queryById(Long id) {
        return orderMapper.queryById(id);
    }

    public List<Order> queryList() {
        return orderMapper.queryList();
    }
}
