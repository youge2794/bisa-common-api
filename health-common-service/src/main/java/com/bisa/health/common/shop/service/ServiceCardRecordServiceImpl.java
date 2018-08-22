package com.bisa.health.common.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.common.shop.dao.IServiceCardRecordDao;
import com.bisa.health.shop.model.ServiceCardRecord;

@Service
public class ServiceCardRecordServiceImpl implements IServiceCardRecordService {
	
	@Autowired
	private IServiceCardRecordDao serviceCardRecordDao;

	@Override
	public Pager<ServiceCardRecord> getPagerServiceCardRecordByUserGuid(int user_guid) {
		return serviceCardRecordDao.getPagerServiceCardRecordByUserGuid(user_guid);
	}
	
	@Override
	public Pager<ServiceCardRecord> getPagerServiceCardRecordByUserGuid(int user_guid, Integer status) {
		return serviceCardRecordDao.getPagerServiceCardRecordByUserGuid(user_guid, status);
	}

	@Override
	public List<ServiceCardRecord> getListServiceCardRecordByUserGuid(int user_guid) {
		return serviceCardRecordDao.getListServiceCardRecordByUserGuid(user_guid);
	}

	//加缓存
	@Override
	public List<ServiceCardRecord> getListServiceCardRecordByGuidAndStatus(int user_guid, int status) {
		if(status == -1){	//全部激活卡
			return serviceCardRecordDao.getListServiceCardRecordByUserGuid(user_guid);
		}else{	//未使用、已使用
			return serviceCardRecordDao.getListServiceCardRecordByGuidAndStatus(user_guid, status);
		}
	}

	@Override
	public boolean addServiceCardRecord(ServiceCardRecord serviceCardRecord) {
		int result = serviceCardRecordDao.addServiceCardRecord(serviceCardRecord);
		return result >= 1 ? true : false;
	}

	@Override
	public boolean updateServiceCardRecord(ServiceCardRecord serviceCardRecord) {
		int result = serviceCardRecordDao.updateServiceCardRecord(serviceCardRecord);
		return result >= 1 ? true : false;
	}

	@Override
	public ServiceCardRecord selectServiceCardRecordByCardNumber(String cardNumber) {
		return serviceCardRecordDao.selectServiceCardRecordByCardNumber(cardNumber);
	}

	@Override
	public List<ServiceCardRecord> getLisRecordByUserGuidAndOrderId(int userGuid, Integer superId,
			Integer orderGoodsId) {
		return serviceCardRecordDao.getLisRecordByUserGuidAndOrderId(userGuid, superId, orderGoodsId);
	}


}
