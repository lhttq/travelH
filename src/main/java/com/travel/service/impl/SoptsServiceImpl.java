package com.travel.service.impl;

import com.travel.entity.Sopts;
import com.travel.dao.SoptsDao;
import com.travel.service.SoptsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sopts)表服务实现类
 *
 * @author makejava
 * @since 2020-06-10 13:11:34
 */
@Service("soptsService")
public class SoptsServiceImpl implements SoptsService {
    @Resource
    private SoptsDao soptsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param spotid 主键
     * @return 实例对象
     */
    @Override
    public Sopts queryById(Integer spotid) {
        return this.soptsDao.queryById(spotid);
    }

    @Override
    public List<Sopts> selectAll() {
        return this.soptsDao.selectAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Sopts> queryAllByLimit(int offset, int limit) {
        return this.soptsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sopts 实例对象
     * @return 实例对象
     */
    @Override
    public Sopts insert(Sopts sopts) {
        this.soptsDao.insert(sopts);
        return sopts;
    }

    /**
     * 修改数据
     *
     * @param sopts 实例对象
     * @return 实例对象
     */
    @Override
    public Sopts update(Sopts sopts) {
        this.soptsDao.update(sopts);
        return this.queryById(sopts.getSpotid());
    }

    /**
     * 通过主键删除数据
     *
     * @param spotid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object spotid) {
        return this.soptsDao.deleteById(spotid) > 0;
    }
}