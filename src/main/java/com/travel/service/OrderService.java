package com.travel.service;

import com.travel.entity.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2020-06-15 09:55:04
 */
public interface OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    Order queryById(Object orderid);
    List<Order> selectAll();
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Order> queryAllByLimit(int offset, int limit);

    /**
     * 根据id查询订单
     *
     * @param order
     * @return 对象列表
     */
    List<Order> selectPyuserId(Order order);
    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    boolean deleteById(Object orderid);

}