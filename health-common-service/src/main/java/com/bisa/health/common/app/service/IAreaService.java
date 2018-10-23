package com.bisa.health.common.app.service;

import java.util.List;

import com.bisa.health.app.model.Server;

/**
 * 手机号码前缀表
 */

public interface IAreaService {

    /**
     * 获取所有对象
     * @return
     */
    public List<Server> getAreaList();

    /**
     * 根据area_code，获取对象
     * @param area_code
     * @return
     */
    public Server getAreaByCode(String area_code);

    /**
     * selectpicker，获取对象
     * @param selectpicker
     * @return
     */
    public Server getAreaByPhoneCode(String selectpicker);
}
