package com.travel.controller;

import com.travel.entity.Sopts;
import com.travel.service.SoptsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sopts)表控制层
 *
 * @author makejava
 * @since 2020-06-10 13:11:34
 */
@Controller
@RequestMapping("sopts")
public class SoptsController {
    /**
     * 服务对象
     */
    @Resource
    private SoptsService soptsService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public Sopts selectOne(Integer id) {
        id = id + 1;
        return this.soptsService.queryById(id);
    }

    /**
     * 查询所有景点信息
     *
     * @return 对象列表
     */
    @GetMapping("selectAll")
    @ResponseBody
    public List<Sopts> selectAll(){
        return this.soptsService.selectAll();
    }

}