package com.aisleep.mapper;

import com.aisleep.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    boolean addOrder();
    Order queryById(Long id);
    List<Order> queryList();
}
