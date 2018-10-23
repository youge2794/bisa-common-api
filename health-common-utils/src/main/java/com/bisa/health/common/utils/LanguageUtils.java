package com.bisa.health.common.utils;

import org.apache.commons.lang3.StringUtils;

public class LanguageUtils {
    /**
     * CN/US/HK/TW等
     * @param areaCode app传来的手机移动端的国家代码
     * @return
     */
    public static String getlang(String areaCode) {
        if (StringUtils.isEmpty(areaCode) || areaCode.equals("CN")) {
            return "CN";
        } else if (areaCode.equals("TW") || areaCode.equals("HK")) {
            return "HK";
        } else {
            // 其他地区都使用英语
            return "EN";
        }
    }

}
