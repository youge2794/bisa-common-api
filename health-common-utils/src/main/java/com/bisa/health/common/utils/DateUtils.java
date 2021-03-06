package com.bisa.health.common.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/**
 * @author Shengzhao Li
 */

public abstract class DateUtils {

    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private DateUtils() {
    }

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    public static String toDateTime(LocalDateTime dateTime, String pattern) {
        return dateTime.format(DateTimeFormatter.ofPattern(pattern, Locale.SIMPLIFIED_CHINESE));
    }

    public static Timestamp timestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static String toDateTime(LocalDateTime date) {
        return toDateTime(date, DEFAULT_DATE_TIME_FORMAT);
    }

    public static String toDateText(LocalDate date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        }
        return date.format(DateTimeFormatter.ofPattern(pattern, Locale.SIMPLIFIED_CHINESE));
    }

    public static String year_month() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        String path = year + "/" + month;
        return path;
    }

    public static String year_month_day() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String date = year + "/" + month + "/" + day;
        return date;
    }

    /**
     * long time to yyyy/MM/dd/HH/mm/ss
     * @param milliTime
     * @return
     */
    public static String year_month_day(String milliTime) {

        Date curDate = new Date(Long.parseLong(milliTime));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss");
        String datetime = sdf.format(curDate);

        datetime = splitDateTime(datetime.replaceAll("/", ""));

        return datetime;
    }

    /**
     * long time to yyyy/MM/dd/HH/mm
     * @param milliTime
     * @return
     */
    public static String year_to_minutes(String milliTime) {

        Date curDate = new Date(Long.parseLong(milliTime));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH/mm");
        String datetime = sdf.format(curDate);
        return datetime;
    }

    /**
     * yyyy/MM/dd/HH/mm/ss  to  long time
     * @return
     */
    public static long timeToLong(String curDate) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        ;
        try {
            date = sdf.parse(curDate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long dateSeconds = date.getTime();

        return dateSeconds;
    }

    /**
     * long time to yyyy-MM-dd HH:mm:ss
     * @param milliTime
     * @return
     */
    public static String standardTime(Long milliTime) {

        Date curDate = new Date(milliTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(curDate);

        return datetime;
    }

    /**
     * 20180101153257 20180101 to 2018/1/1/15/32/57 2018/1/1
     * @param datetime
     * @return
     */
    public static String splitDateTime(String datetime) {

        String newDate = datetime;
        if (datetime.length() == 14) {// yyyyMMddHHmmss
            String year = datetime.substring(0, 4);
            int month = Integer.parseInt(datetime.substring(4, 6));
            int day = Integer.parseInt(datetime.substring(6, 8));
            int hour = Integer.parseInt(datetime.substring(8, 10));
            int mins = Integer.parseInt(datetime.substring(10, 12));
            int seconds = Integer.parseInt(datetime.substring(12, 14));
            newDate = year + "/" + month + "/" + day + "/" + hour + "/" + mins + "/" + seconds;
        }

        if (datetime.length() == 8) {// yyyyMMdd
            String year = datetime.substring(0, 4);
            int month = Integer.parseInt(datetime.substring(4, 6));
            int day = Integer.parseInt(datetime.substring(6, 8));

            newDate = year + "/" + month + "/" + day;
        }

        return newDate;
    }

    /**
     * 获得GMT零时区时间的毫秒数
     * @return
     */
    public static Long getGMTtimeSeconds() {
        Calendar cal = Calendar.getInstance(Locale.getDefault());
        int zoneOffset = cal.get(Calendar.ZONE_OFFSET);
        int dstOffset = cal.get(Calendar.DST_OFFSET);
        cal.add(Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        return cal.getTimeInMillis();
    }

    /**
     * get global time
     * @param time yyyy-MM-dd hh:mm:ss
     * @return 1/9/18 10:39 AM
     */
    public static String getFormatEnDateTime(String time) {
        // 获取时间值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            return time;
        }
        // date和time值按照short模式格式化输出
        DateFormat shortDF = DateFormat.getDateTimeInstance(SimpleDateFormat.SHORT, SimpleDateFormat.SHORT, Locale.US);
        String en_time = shortDF.format(date);
        return en_time;
    }

    /**
     * 转换用户时区
     */
    public static Calendar convertUTime(String timeZoneStr) {

        TimeZone timeZone = TimeZone.getTimeZone(timeZoneStr);
        Calendar cal = GregorianCalendar.getInstance(timeZone);

        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        outputFormat.setTimeZone(timeZone);
        Date date = new Date(System.currentTimeMillis());

        try {
            date = outputFormat.parse(outputFormat.format(date));
        } catch (ParseException e) {
            return null;
        }
        cal.setTime(date);
        return cal;

    }

    public static String convertUTimeStr(String timeZoneStr) {

        TimeZone timeZone = TimeZone.getTimeZone(timeZoneStr);
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        outputFormat.setTimeZone(timeZone);
        Date date = new Date(System.currentTimeMillis());
        return outputFormat.format(date);

    }

    public static Calendar convertUTime(String timeZoneStr, String dateTime) {

        TimeZone timeZone = TimeZone.getTimeZone(timeZoneStr);
        Calendar cal = GregorianCalendar.getInstance(timeZone);

        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
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
     * @param time_zone
     * @param gmt_seconds
     * @return area_time seconds
     */
    public static Long getAreaTime(String time_zone, Long gmt_seconds) {
        TimeZone srcTimeZone = TimeZone.getTimeZone("GMT");
        TimeZone destTimeZone = TimeZone.getTimeZone(time_zone);
        Long targetTime = gmt_seconds - srcTimeZone.getRawOffset() + destTimeZone.getRawOffset();
        return targetTime;
    }

    /**
     * 将gmt时间转换成用户所在时区时间
     * yyyy-MM-dd HH:mm:ss
     * @param timeZoneStr
     * @return
     */
    public static String gmtToUserTime(String timeZoneStr, String GTMDate) {
        SimpleDateFormat format;
        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date result_date;
        long result_time = 0;

        if (null == GTMDate) {
            return GTMDate;
        } else {
            try {
                format.setTimeZone(TimeZone.getTimeZone("GMT00:00"));
                result_date = format.parse(GTMDate);
                result_time = result_date.getTime();
                format.setTimeZone(TimeZone.getTimeZone(timeZoneStr));
                return format.format(result_time);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return GTMDate;
    }


    /**
     * @param time 2005-12-15 09:41:30 or 2005-12-15
     * @return 15/12/2005 09:41:30 or 15/12/2005
     */
    public static String strTimeToGlobalTime(String time) {
        try {
            if (time.contains(" ") && isDateTime(time)) {
                // 2005-12-15 09:41:30
                return getFormatEnDateTime(time);

            } else if (isDate(time)) {
                // 2005-12-15
                String[] time_str = time.split("-");
                if (time_str.length == 3) {
                    time = time_str[2] + "/" + time_str[1] + "/" + time_str[0];
                }
                return time;
            } else {
                return time;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return time;
        }
    }

    /**
     * is yyyy-MM-dd HH:mm:ss
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
     * @param date
     * @return
     */
    public static boolean isDate(String date) {
        Pattern p = Pattern.compile(
                "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))?$");
        return p.matcher(date).matches();
    }

    /**
     * 日期加减
     * Calendar.MONTH, count
     * @param unit
     * @param count
     * @return
     */
    public static Date getCalendarFinishedTime(int unit, int count) {
        Calendar calendar = Calendar.getInstance();//得到Calendar实例
        calendar.add(unit, count);   //日期加减
        return calendar.getTime();//得到时间赋给Data
    }

    /**
     * Date转Calendar
     * @param date
     * @return
     */
    public static Calendar dataToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

}