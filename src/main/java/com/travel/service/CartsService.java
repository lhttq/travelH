package com.travel.service;

import com.travel.entity.Carts;
import java.util.List;

/**
 * (Carts)表服务接口
 *
 * @author makejava
 * @since 2020-06-08 22:25:56
 */
public interface CartsService {

    /**
     * 通过ID查询单条数据
     *
     * @param cartid 主键
     * @return 实例对象
     */
    Carts queryById(Integer cartid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Carts> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carts 实例对象
     * @return 实例对象
     */
    Carts insert(Carts carts);

    /**
     * 修改数据
     *
     * @param carts 实例对象
     * @return 实例对象
     */
    Carts update(Carts carts);

    /**
     * 通过主键删除数据
     *
     * @param cartid 主键
     * @return 是否成功
     */
    boolean deleteById(Object cartid);

}