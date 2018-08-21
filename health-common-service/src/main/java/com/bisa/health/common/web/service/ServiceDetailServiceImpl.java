package com.bisa.health.common.web.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;
import com.bisa.health.common.utils.DateUtils;
import com.bisa.health.common.web.dao.IServiceDetailDao;

@Service
public class ServiceDetailServiceImpl implements IServiceDetailService {
	
	@Autowired
	private IServiceDetailDao serviceDetailDao;

	@Override
	public ServiceDetail selectServiceDetailByGuidAndClassifyId(int userGuid, int classifyId, int serviceType) {
		return serviceDetailDao.selectServiceDetailByGuidAndClassifyId(userGuid, classifyId, serviceType);
	}

	@Override
	public boolean addUpdateServiceDetail(ServiceDetail serviceDetail, int userGuid, Integer cardType, int classifyId, int count) {
		int result = 0;
		if(serviceDetail == null){  //添加服务细节表
			serviceDetail = new ServiceDetail();
			serviceDetail.setClassifyId(classifyId);
			serviceDetail.setIsActive(1);
			serviceDetail.setUserGuid(userGuid);
			serviceDetail.setVersion(1);
			if(cardType == ServiceType.TIMING.getValue()){	//时限
				Date finishedTime = DateUtils.getCalendarFinishedTime(Calendar.MONTH, count);
				serviceDetail.setFinishedTime(finishedTime);
				serviceDetail.setServiceType(cardType);
			}else if(cardType == ServiceType.COUNT.getValue()){	//次数
				serviceDetail.setCount(count);
				serviceDetail.setServiceType(cardType);
			}else{
				return false;
			}
			
			result = serviceDetailDao.addServiceDetail(serviceDetail);
			
		}else{  //修改服务细节表
			
			if(cardType == ServiceType.TIMING.getValue()){	//时限
				Calendar calendar = DateUtils.dataToCalendar(serviceDetail.getFinishedTime());	//得到Calendar实例
				calendar.add(Calendar.MONTH, count); //月份累加
				serviceDetail.setFinishedTime(calendar.getTime());
			}else if(cardType == ServiceType.COUNT.getValue()){  //次数型
				serviceDetail.setCount(serviceDetail.getCount() + count);
			}else{
				return false;
			}
			int version = serviceDetail.getVersion();
			serviceDetail.setVersion(version + 1);
			result = serviceDetailDao.updateServiceDetail(serviceDetail, version);
		}
		
		return result >= 1 ? true : false;
	}

}
