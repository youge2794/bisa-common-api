package com.bisa.health.app.ecg.dto;

/**
 * app 下单商品dto
 */

public class BelowOrderProductDto {

    private String goodsNumber; //商品的编号
    private Integer count; //商品的数量

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
