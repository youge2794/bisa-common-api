package com.bisa.health.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import com.bisa.health.connon.constant.DateTimeConstant;

/**
 * @author Shengzhao Li
 */
public abstract class DateTimeUtils {


	/**
	 * Private constructor
	 */
	private DateTimeUtils() {
	}

	public static LocalDateTime now() {
		return LocalDateTime.now();
	}
	
	/**
	 * 获取当前时间并格式化
	 * @param dateTime
	 * @param pattern
	 * @return
	 */
	public static String toDateTime(Date date,String pattern) {
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	
	/**
	 * 获取当前时间并格式化
	 * @param dateTime
	 * @param pattern
	 * @return
	 */
	public static String toDateTime(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat(DateTimeConstant.DATETIME_FORMAT_DEFAULT);
		return sdf.format(date);
	}
	/**
	 * 获取当前时间并格式化
	 * @param dateTime
	 * @param pattern
	 * @return
	 */
	public static String toDateTime(LocalDateTime dateTime, String pattern) {
		return dateTime.format(DateTimeFormatter.ofPattern(pattern));
	}
	
	/**
	 * 获取当前时间并默认格式化
	 * @param date
	 * @return
	 */
	public static String toDateTime(LocalDateTime date) {
		return toDateTime(date, DateTimeConstant.DATETIME_FORMAT_DEFAULT);
	}
	
	public static String toDateTime(String pattern) {
		return toDateTime(LocalDateTime.now(), pattern);
	}
	
	/**
	 * 获取当前时间并格式化
	 * @param date
	 * @return
	 */
	public static String toDateTime(Long milliseconds,String pattern) {
		Date date=new Date(milliseconds);
		return toDateTime(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()), pattern);
	}
	
	/**
	 * 获取当前时间并格式化
	 * @param date
	 * @return
	 */
	public static String toDateTime(Long milliseconds) {
		Date date=new Date(milliseconds);
		return toDateTime(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()), DateTimeConstant.DATETIME_FORMAT_DEFAULT);
	}
	public static Timestamp timestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * 获得GMT零时区时间的毫秒数
	 * 
	 * @return
	 */
	public static Long getGMTtimeMilliseconds() {
		TimeZone srcTimeZone = TimeZone.getDefault();
		long cmgMillSeconds=System.currentTimeMillis()-(srcTimeZone.getRawOffset());
		return cmgMillSeconds;
	}

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

	/**
	 * 以pattern连接年月
	 * @param pattern
	 * @return
	 */
	public static String YearMonth(String pattern) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		String path = year + pattern + month;
		return path;
	}
	/**
	 * 以pattern连接年月日
	 * @param pattern
	 * @return
	 */
	public static String YearMonthDay(String pattern) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		String date = year + pattern + month + pattern + day;
		return date;
	}



	/**
	 * 把时间字符串按格式换算毫秒数
	 * @param curDate
	 * @param pattern
	 * @return
	 */
	public static long timeToMilliseconds(String curDate,String pattern) {

		return LocalDateTime.parse(curDate, DateTimeFormatter.ofPattern(pattern))
				.atZone(ZoneId.systemDefault())
				.toInstant().toEpochMilli();
	}
	
	/**
	 * 把时间字符串按默认(yyyy-MM-dd HH:mm:ss)格式换算毫秒数
	 * @param curDate
	 * @param pattern
	 * @return
	 */
	public static long timeToMilliseconds(String curDate) {

		return timeToMilliseconds(curDate,DateTimeConstant.DATETIME_FORMAT_DEFAULT);
	}


	/**
	 * 
	 * 把默认格式默认(yyyy-MM-dd HH:mm:ss)来转换成默(yyyy/MM/dd/HH/mm/ss)或者(yyyy/MM/dd/)的格式
	 * @param datetime
	 * @return
	 */
	public static String SplitDateTime(String datetime) {
		String newDate = datetime;
		if (datetime.length() == 19) {// yyyy-MM-dd  HH:mm:ss
			String year = datetime.substring(0, 4);
			String month = datetime.substring(5, 7);
			String day = datetime.substring(8, 10);
			String hour = datetime.substring(11,13);
			String mins = datetime.substring(14, 16);
			String seconds = datetime.substring(17, 19);
			newDate = year + "/" + month + "/" + day + "/" + hour + "/" + mins + "/" + seconds;
		}
		if (datetime.length() == 14) {// yyyyMMddHHmmss
			String year = datetime.substring(0, 4);
			String month = datetime.substring(4, 6);
			String day = datetime.substring(6, 8);
			String hour = datetime.substring(8, 10);
			String mins = datetime.substring(10, 12);
			String seconds = datetime.substring(12, 14);
			newDate = year + "/" + month + "/" + day + "/" + hour + "/" + mins + "/" + seconds;
		}

		if (datetime.length() == 8) {//yyyyMMdd
			String year = datetime.substring(0, 4);
			String month = datetime.substring(4, 6);
			String day = datetime.substring(6, 8);

			newDate = year + "/" + month + "/" + day;
		}

		return newDate;
	}

	

	/**
	 * 把字符时间换算成GMT时间
	 * 
	 * @param time
	 *            yyyy-MM-dd hh:mm:ss
	 * @return 1/9/18 10:39 AM
	 */
	public static String FormatDateToGMTTimeStr(String time) {
		
		long milliseconds=timeToMilliseconds(time);
		LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(milliseconds/1000, 0, ZoneOffset.UTC);
		return dateFromBase.format(DateTimeFormatter.ofPattern(DateTimeConstant.DATETIME_FORMAT_DEFAULT));
	}
	
	
	

	/**
	 * 根据时区获取默认时间的时间
	 * @param timeZoneStr
	 * @return
	 */
	public static String convertUTimeStr(String timeZoneStr) {

		TimeZone timeZone = TimeZone.getTimeZone(timeZoneStr);
		SimpleDateFormat outputFormat = new SimpleDateFormat(DateTimeConstant.DATETIME_FORMAT_DEFAULT);
		outputFormat.setTimeZone(timeZone);
		Date date = new Date(System.currentTimeMillis());
		return outputFormat.format(date);

	}
	
	
	/**
	 * 根据时区获取默认时间的Calendar
	 * @param timeZoneStr
	 * @return
	 */
	public static Calendar convertCalendar(String timeZoneStr, String dateTime) {

		TimeZone timeZone = TimeZone.getTimeZone(timeZoneStr);
		Calendar cal = GregorianCalendar.getInstance(timeZone);
		SimpleDateFormat outputFormat = new SimpleDateFormat(DateTimeConstant.DATETIME_FORMAT_DEFAULT);
		outputFormat.setTimeZone(timeZone);
		Date date = null;
		try {
			date = outputFormat.parse(dateTime);
		} catch (ParseException e) {
			return null;
		}
		cal.setTime(date);
		return cal;

	}
	

	/**
	 * 将gmt时间转换成用户所在时区时间
	 * yyyy-MM-dd HH:mm:ss
	 * @param timeZoneStr
	 * @param dateTime "yyyy-MM-dd HH:mm:ss"
	 * @return
	 */
	public static String GMTToUserTime(String timeZoneStr, String GTMDate) {
		
		TimeZone timeZone=TimeZone.getTimeZone(timeZoneStr);
		long milliseconds=timeToMilliseconds(GTMDate)+(timeZone.getRawOffset()*2);
		LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(milliseconds/1000, 0, ZoneOffset.UTC);
		return dateFromBase.format(DateTimeFormatter.ofPattern(DateTimeConstant.DATETIME_FORMAT_DEFAULT));
		
	}



	/**
	 * 将用户时间转换成GMT时间的指定格式
	 * 
	 * @param time 2005-12-15 09:41:30 or 2005-12-15
	 * @return 15/12/2005 09:41:30 or 15/12/2005
	 */
	public static String StrTimeToGMTTime(String time) {

		try {
				// 2005-12-15
				String[] time_str = time.split("-");
				if (time_str.length == 3) {
					time = time_str[2] + "/" + time_str[1] + "/" + time_str[0];
				}
				return time;
		
		} catch (Exception e) {
			return time;
		}
	}

	/**
	 * is yyyy-MM-dd HH:mm:ss
	 * 
	 * @param datetime
	 * @return
	 */
	public static boolean isDateTime(String datetime) {
		Pattern p = Pattern.compile(
				"^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1][0-9])|([2][0-4]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		return p.matcher(datetime).matches();
	}

	/**
	 * is yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isDate(String date) {
		Pattern p = Pattern.compile(
				"^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))?$");
		return p.matcher(date).matches();
	}
	

}