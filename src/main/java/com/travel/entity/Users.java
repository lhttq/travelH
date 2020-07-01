package com.travel.entity;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-06-08 22:27:10
 */
public class Users implements Serializable {
    private static final long serialVersionUID = -21840524857148547L;
    /**
    * 用户id
    */
    private Integer userid;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 身份证号码
    */
    private String usernum;
    /**
    * 手机号
    */
    private String userphone;
    /**
    * 密码
    */
    private String userpass;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", usernum='" + usernum + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}