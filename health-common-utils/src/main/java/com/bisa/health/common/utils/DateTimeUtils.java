package com.bisa.health.common.utils;

import java.util.Calendar;
import java.util.Locale;

public class DateTimeUtils {

	/**
	 * 获取服务器的年份
	 * @return
	 */
	public static int ServerYear() {
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		return cal.get(Calendar.YEAR);

	}
	/**
	 * 获取服务器的月份
	 * @return
	 */
	public static int ServerMonth() {
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		return cal.get(Calendar.MONTH)+1;
	}
	
	/**
	 * 获取服务器的天数
	 * @return
	 */
	public static int ServerDay() {
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		System.out.println(cal.get(Calendar.SECOND));
	}
	
	/**
	 * 当前服务器时间
	 * 
	 * @return
	 */
	public static Long currentGmtTime() {
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		int zoneOffset = cal.get(Calendar.ZONE_OFFSET);
		int dstOffset = cal.get(Calendar.DST_OFFSET);
		cal.add(Calendar.MILLISECOND, -((zoneOffset + dstOffset)));
		Long datetime = cal.getTimeInMillis();
		
		return datetime;
	}
}
