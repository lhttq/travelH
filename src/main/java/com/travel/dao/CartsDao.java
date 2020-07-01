package com.travel.dao;

import com.travel.entity.Carts;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Carts)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-08 22:25:56
 */
public interface CartsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cartid 主键
     * @return 实例对象
     */
    Carts queryById(Object cartid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Carts> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carts 实例对象
     * @return 对象列表
     */
    List<Carts> queryAll(Carts carts);

    /**
     * 新增数据
     *
     * @param carts 实例对象
     * @return 影响行数
     */
    int insert(Carts carts);

    /**
     * 修改数据
     *
     * @param carts 实例对象
     * @return 影响行数
     */
    int update(Carts carts);

    /**
     * 通过主键删除数据
     *
     * @param cartid 主键
     * @return 影响行数
     */
    int deleteById(Object cartid);

}