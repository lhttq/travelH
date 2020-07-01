package com.travel.entity;

import java.io.Serializable;

/**
 * (Sopts)实体类
 *
 * @author makejava
 * @since 2020-06-10 13:11:25
 */
public class Sopts implements Serializable {
    private static final long serialVersionUID = -33841849238393545L;
    /**
    * 景点id
    */
    private Integer spotid;
    /**
    * 景点名
    */
    private String spotname;
    /**
    * 景点所在城市
    */
    private String spotcity;
    /**
    * 门票价格
    */
    private Double spotprice;
    /**
    * 景点图片
    */
    private String soptimg;
    /**
    * 景点级别
    */
    private String spotgrade;


    public Integer getSpotid() {
        return spotid;
    }

    public void setSpotid(Integer spotid) {
        this.spotid = spotid;
    }

    public String getSpotname() {
        return spotname;
    }

    public void setSpotname(String spotname) {
        this.spotname = spotname;
    }

    public String getSpotcity() {
        return spotcity;
    }

    public void setSpotcity(String spotcity) {
        this.spotcity = spotcity;
    }

    public Double getSpotprice() {
        return spotprice;
    }

    public void setSpotprice(Double spotprice) {
        this.spotprice = spotprice;
    }

    public String getSoptimg() {
        return soptimg;
    }

    public void setSoptimg(String soptimg) {
        this.soptimg = soptimg;
    }

    public String getSpotgrade() {
        return spotgrade;
    }

    public void setSpotgrade(String spotgrade) {
        this.spotgrade = spotgrade;
    }

}