package com.travel.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-06-15 09:54:56
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 932837837160837210L;
    /**
    * id
    */
    private Integer orderid;
    /**
    * 订单号
    */
    private String ordernum;
    /**
    * 数量
    */
    private Integer num;
    /**
    * 景点名称
    */
    private String soptname;
    /**
    * 用户id
    */
    private Integer userid;


    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSoptname() {
        return soptname;
    }

    public void setSoptname(String soptname) {
        this.soptname = soptname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}