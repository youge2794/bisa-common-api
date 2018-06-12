package com.bisa.health.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomUtils {
	
	/**
	 * 已当前系统时间作为随机数
	 * 年月日秒和3个随机数
	 * @return
	 */
	public static String RandomOfDateTime(){
		SimpleDateFormat userSdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timeStr=userSdf.format(new Date());
		Random rand = new Random();
		int randInt=rand.nextInt(1000);
		return timeStr+randInt;
		
		
	}
	
	/**
	 * 已当前系统时间作为随机数
	 * 年月日秒+一个基础ID+3个随机数
	 * @return
	 */
	public static String RandomOfDateTime(int guid){
		SimpleDateFormat userSdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timeStr=userSdf.format(new Date());
		Random rand = new Random();
		int randInt=rand.nextInt(1000);
		return timeStr+guid+randInt;
		
	}
}
