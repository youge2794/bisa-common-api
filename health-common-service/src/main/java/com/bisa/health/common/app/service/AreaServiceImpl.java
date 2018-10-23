package com.bisa.health.common.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.app.model.Server;
import com.bisa.health.common.app.dao.IAreaDao;

@Service
public class AreaServiceImpl implements IAreaService {

    @Autowired
    private IAreaDao iAreaDao;

    @Override
    @Cacheable(value = "spring-defaultCache", key = "'area_list'")
    public List<Server> getAreaList() {
        return iAreaDao.getAreaList();
    }

    @Override
    @Cacheable(value = "spring-defaultCache", key = "'area'+#area_code")
    public Server getAreaByCode(String area_code) {
        return iAreaDao.getAreaByCode(area_code);
    }


    @Override
    @Cacheable(value = "spring-defaultCache", key = "'area'+#selectpicker")
    public Server getAreaByPhoneCode(String selectpicker) {
        return iAreaDao.getAreaByPhoneCode(selectpicker);
    }


}
