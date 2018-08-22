package com.bisa.health.common.shop.service;

import java.util.List;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.shop.model.ServiceCardRecord;

public interface IServiceCardRecordService {
	
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
	
	/**
	 * 根据卡号获得使用记录
	 * @param cardNumber
	 * @return
	 */
	ServiceCardRecord selectServiceCardRecordByCardNumber(String cardNumber);

	boolean addServiceCardRecord(ServiceCardRecord serviceCardRecord);
	
	boolean updateServiceCardRecord(ServiceCardRecord serviceCardRecord);

	/**
	 * 查找记录表
	 * 用于判断订单是否已经关联激活卡
	 * 一个订单详情同类激活卡数量可能多个，因此返回list
	 * @param userGuid
	 * @param superId
	 * @param orderGoodsId
	 * @return
	 */
	List<ServiceCardRecord> getLisRecordByUserGuidAndOrderId(int userGuid, Integer superId, Integer orderGoodsId);


	
}

