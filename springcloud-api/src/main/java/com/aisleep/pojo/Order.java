package com.aisleep.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 类表关系映射  orm
 * Accessors链式写法 默认为false 这里把它开启
 * 实体类 Order
 */
@Accessors(chain = true)
@Data
public class Order implements Serializable {
    //主键
    private Long id;
    //订单数量
    private int num;
    //操作人
    private String operator;
    //订单发货地址
    private String address;
    //下单时间
    private Date creatTime;
    //订单修改时间
    private Date updateTime;
    //是否删除字段
    private int delete;

    /**
     * 链式写法
     * Order order = new Order();
     * order.setNum(1).setAddress("")---->支持这种写法
     */
}
