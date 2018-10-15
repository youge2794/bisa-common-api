package com.bisa.health.shop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品图片model
 */

@Entity
@Table(name = "s_goods_img")
public class GoodsImg implements Serializable {

    private static final long serialVersionUID = 6982202429029890618L;

    private Integer id;
    private String goodsNumber;    //商品编号
    private String imgUrl;    // 商品图片地址
    private Integer position;        //位置

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "goods_number")
    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public GoodsImg() {
        super();
    }

    public GoodsImg(Integer id, String goodsNumber, String imgUrl, Integer position) {
        super();
        this.id = id;
        this.goodsNumber = goodsNumber;
        this.imgUrl = imgUrl;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GoodsImg [id=" + id + ", goodsNumber=" + goodsNumber + ", imgUrl=" + imgUrl + ", position=" + position
                + "]";
    }

}