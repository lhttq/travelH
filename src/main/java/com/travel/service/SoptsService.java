package com.travel.service;

import com.travel.entity.Sopts;
import java.util.List;

/**
 * (Sopts)表服务接口
 *
 * @author makejava
 * @since 2020-06-10 13:11:33
 */
public interface SoptsService {

    /**
     * 通过ID查询单条数据
     *
     * @param spotid 主键
     * @return 实例对象
     */
    Sopts queryById(Integer spotid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sopts> queryAllByLimit(int offset, int limit);

    /**
     *
     * @return 对象列表
     */
    List<Sopts> selectAll();
    /**
     * 新增数据
     *
     * @param sopts 实例对象
     * @return 实例对象
     */
    Sopts insert(Sopts sopts);

    /**
     * 修改数据
     *
     * @param sopts 实例对象
     * @return 实例对象
     */
    Sopts update(Sopts sopts);

    /**
     * 通过主键删除数据
     *
     * @param spotid 主键
     * @return 是否成功
     */
    boolean deleteById(Object spotid);

}