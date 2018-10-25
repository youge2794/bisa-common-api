package com.bisa.health.app.ecg.dto;

/**
 * app 下单dto
 */

public class BelowOrderDto {

    private BelowOrderProductDto belowOrderProductDto;//商品的集合
    private String frontendUrl;//支付同步的地址

    public BelowOrderProductDto getBelowOrderProductDto() {
        return belowOrderProductDto;
    }

    public void setBelowOrderProductDto(BelowOrderProductDto belowOrderProductDto) {
        this.belowOrderProductDto = belowOrderProductDto;
    }

    public String getFrontendUrl() {
        return frontendUrl;
    }

    public void setFrontendUrl(String frontendUrl) {
        this.frontendUrl = frontendUrl;
    }

    @Override
    public String toString() {
        return "BelowOrderDto{" +
                "belowOrderProductDto=" + belowOrderProductDto +
                ", frontendUrl='" + frontendUrl + '\'' +
                '}';
    }
}
