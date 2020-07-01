package com.travel.controller;

import com.travel.entity.Users;
import com.travel.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-06-08 22:27:10
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Users selectOne(Integer id) {
        return this.usersService.queryById(id);
    }

    /**
     * 根据用户名查询用户
     *
     * @param users
     * @return
     */
    @RequestMapping("selectByuserName")
    public Integer selectByuserName(@RequestBody Users users){
        int i = 0;
        List<Users> list =  this.usersService.selectByUserName(users);
        if(list.size()>0) {
            Users users1 = list.get(0);
            i = 1;
        }
        return i;
    }

    /**
     * 注册
     *
     * @param users
     * @return
     */
    @RequestMapping("insertUser")
     public int insertUser(@RequestBody Users users){
        int i = 0;
        List<Users> list = this.usersService.selectByUserName(users);
        if(list.size() > 0){
             i = -1;
        }else{
           this.usersService.insert(users);
           i = 1;
        }
        return i;
    }
}