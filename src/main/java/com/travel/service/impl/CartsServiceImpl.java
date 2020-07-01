package com.travel.service.impl;

import com.travel.entity.Carts;
import com.travel.dao.CartsDao;
import com.travel.service.CartsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Carts)表服务实现类
 *
 * @author makejava
 * @since 2020-06-08 22:25:56
 */
@Service("cartsService")
public class CartsServiceImpl implements CartsService {
    @Resource
    private CartsDao cartsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cartid 主键
     * @return 实例对象
     */
    @Override
    public Carts queryById(Integer cartid) {
        return this.cartsDao.queryById(cartid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Carts> queryAllByLimit(int offset, int limit) {
        return this.cartsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carts 实例对象
     * @return 实例对象
     */
    @Override
    public Carts insert(Carts carts) {
        this.cartsDao.insert(carts);
        return carts;
    }

    /**
     * 修改数据
     *
     * @param carts 实例对象
     * @return 实例对象
     */
    @Override
    public Carts update(Carts carts) {
        this.cartsDao.update(carts);
        return this.queryById(carts.getCartid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cartid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object cartid) {
        return this.cartsDao.deleteById(cartid) > 0;
    }
}