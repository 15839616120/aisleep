package com.aisleep.controller;

import com.aisleep.pojo.Order;
import com.aisleep.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 提供restful服务
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private DiscoveryClient client;

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

    /**
     * 获取注册进eureka的一些服务信息
     */
    @GetMapping("/order/discovery")
    public Object discovery(){
        //获取微服务列表清单
        List<String> server = client.getServices();
        System.out.println(server);
        //得到一个具体的微服务信息，可以得到该微服务的具体信息
        List<ServiceInstance> list = client.getInstances("此处为微服务的名称application的名称");
        for (ServiceInstance serviceInstance : list) {
            System.out.println(
                    serviceInstance.getHost()+"\t"+
                    serviceInstance.getPort()+"\t"+
                    serviceInstance.getUri()+"\t"+
                    serviceInstance.getServiceId()+"\t"
            );
        }
        return this.client;
    }
}
