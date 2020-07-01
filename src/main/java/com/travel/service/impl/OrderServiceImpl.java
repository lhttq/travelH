package com.travel.service.impl;

import com.travel.entity.Order;
import com.travel.dao.OrderDao;
import com.travel.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2020-06-15 09:55:07
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Object orderid) {
        return this.orderDao.queryById(orderid);
    }

    @Override
    public List<Order> selectAll() {
        return this.orderDao.selectAll();
    }

    /**
     * 根据id查询订单
     *
     * @param order
     * @return 对象列表
     */
    @Override
    public List<Order> selectPyuserId(Order order) {
        return this.orderDao.queryAll(order);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Order> queryAllByLimit(int offset, int limit) {
        return this.orderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order insert(Order order) {
        this.orderDao.insert(order);
        return order;
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderDao.update(order);
        return this.queryById(order.getOrderid());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object orderid) {
        return this.orderDao.deleteById(orderid) > 0;
    }
}