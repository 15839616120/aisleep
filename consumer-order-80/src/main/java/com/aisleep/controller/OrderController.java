package com.aisleep.controller;

import com.aisleep.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {

    //理解：消费者，不应该有service层
    //RESTful  RESTTemplate 供我们直接调用

    //restTemplate提供多种便捷访问http的方法，简单的restful服务模板
    //需要的三个参数(URL【去哪拿】,请求参数【有就加上，没有就不用写该参数】,返回值的Class)
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX="http://localhost:8001";


    @RequestMapping("/consumer/order/get/{id}")
    public Order get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/order/get/"+id,Order.class);
    }

    @PostMapping("/consumer/order/add/")
    public boolean add(Order order){
        return restTemplate.postForObject(REST_URL_PREFIX+"/order/add/",order,Boolean.class);
    }

    @PostMapping("/consumer/order/list/")
    public List<Order> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/order/list",List.class);
    }

}
