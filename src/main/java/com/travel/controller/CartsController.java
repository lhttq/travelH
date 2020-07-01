package com.travel.controller;

import com.travel.entity.Carts;
import com.travel.service.CartsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Carts)表控制层
 *
 * @author makejava
 * @since 2020-06-08 22:25:57
 */
@RestController
@RequestMapping("carts")
public class CartsController {
    /**
     * 服务对象
     */
    @Resource
    private CartsService cartsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Carts selectOne(Integer id) {
        return this.cartsService.queryById(id);
    }

}