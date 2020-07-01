package com.travel.controller;

import com.travel.entity.Order;
import com.travel.entity.Users;
import com.travel.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2020-06-15 09:55:07
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Order selectOne(Object id) {
        return this.orderService.queryById(id);
    }

    /**
     * 添加数据
     *
     * @param order
     * @return
     */
    @RequestMapping("insertOne")
    public int insertOne(@RequestBody Order order){
        int i = 0;
        Order order1 = this.orderService.insert(order);
        if(order1 != null){
            i = 1;
        }
        return i;
    }
    @RequestMapping("selsectById")
    public List<Order> selsectById(@RequestBody Order order){
        return this.orderService.selectPyuserId(order);
    }
    @RequestMapping("selectAll")
    public List<Order> selectAll(){
        return this.orderService.selectAll();
    }

    @RequestMapping("del")
    public int del(int orderid){
        int i = 0;
        boolean flog = this.orderService.deleteById(orderid);
        if(flog){
            i = 1;
        }
        return i;
    }
}