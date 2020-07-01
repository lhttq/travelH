package com.travel.dao;

import com.travel.entity.Sopts;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Sopts)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-10 13:11:31
 */
public interface SoptsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param spotid 主键
     * @return 实例对象
     */
    Sopts queryById(Object spotid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sopts> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sopts 实例对象
     * @return 对象列表
     */
    List<Sopts> queryAll(Sopts sopts);

    /**
     * 新增数据
     *
     * @param sopts 实例对象
     * @return 影响行数
     */
    int insert(Sopts sopts);

    /**
     * 修改数据
     *
     * @param sopts 实例对象
     * @return 影响行数
     */
    int update(Sopts sopts);

    /**
     * 通过主键删除数据
     *
     * @param spotid 主键
     * @return 影响行数
     */
    int deleteById(Object spotid);

    List<Sopts> selectAll();
}