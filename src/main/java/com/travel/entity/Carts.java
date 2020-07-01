package com.travel.entity;

import java.io.Serializable;

/**
 * (Carts)实体类
 *
 * @author makejava
 * @since 2020-06-08 22:25:55
 */
public class Carts implements Serializable {
    private static final long serialVersionUID = 743155870876376696L;
    /**
    * 购物车id
    */
    private Integer cartid;
    /**
    * 景点名
    */
    private String spotname;
    /**
    * 价格
    */
    private Double price;
    /**
    * 数量
    */
    private Integer num;


    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public String getSpotname() {
        return spotname;
    }

    public void setSpotname(String spotname) {
        this.spotname = spotname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}