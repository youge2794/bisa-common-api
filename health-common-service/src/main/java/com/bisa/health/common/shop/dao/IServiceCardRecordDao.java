package com.bisa.health.common.shop.dao;

import java.util.List;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.shop.model.ServiceCardRecord;

public interface IServiceCardRecordDao {
	/**
	 * 获得用户所有服务卡的分页
	 * @param user_guid
	 * @return
	 */
	Pager<ServiceCardRecord> getPagerServiceCardRecordByUserGuid(int user_guid);
	
	Pager<ServiceCardRecord> getPagerServiceCardRecordByUserGuid(int user_guid, Integer status);
	
	/**
	 * 获得用户所有激活服务的数据
	 * @param user_guid
	 * @return
	 */
	List<ServiceCardRecord> getListServiceCardRecordByUserGuid(int user_guid);
	
	/**
	 * 根据  用户id 和   使用状态   获取的数据
	 * @param user_guid
	 * @param status
	 * @return
	 */
	List<ServiceCardRecord> getListServiceCardRecordByGuidAndStatus(int user_guid, int status);

	int addServiceCardRecord(ServiceCardRecord serviceCardRecord);
	
	int updateServiceCardRecord(ServiceCardRecord serviceCardRecord);

	ServiceCardRecord selectServiceCardRecordByCardNumber(String cardNumber);

	List<ServiceCardRecord> getLisRecordByUserGuidAndOrderId(int userGuid, Integer superId, Integer orderGoodsId);

	
}
