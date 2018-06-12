package com.bisa.health.common.utils;

import java.security.MessageDigest;

public class MD5Util {
	private static String byteArrayToHexString(byte b[]) {  
        StringBuffer resultSb = new StringBuffer();  
        for (int i = 0; i < b.length; i++)  
            resultSb.append(byteToHexString(b[i]));  
  
        return resultSb.toString();  
    }  
  
    private static String byteToHexString(byte b) {  
        int n = b;  
        if (n < 0)  
            n += 256;  
        int d1 = n / 16;  
        int d2 = n % 16;  
        return hexDigits[d1] + hexDigits[d2];  
    }  
  

    
    public static String MD5Encode(String origin, String charsetname) {  
        String resultString = null;  
        try {  
            resultString = new String(origin);  
            MessageDigest md = MessageDigest.getInstance("MD5");  
            if (charsetname == null || "".equals(charsetname))  
                resultString = byteArrayToHexString(md.digest(resultString  
                        .getBytes()));  
            else  
                resultString = byteArrayToHexString(md.digest(resultString  
                        .getBytes(charsetname)));  
        } catch (Exception exception) {  
        }  
        return resultString;  
    }
    public static String MD5Encode(String sourceStr) {  
    	try {  
            // 获得MD5摘要算法的 MessageDigest对象  
            MessageDigest mdInst = MessageDigest.getInstance("MD5");  
            // 使用指定的字节更新摘要  
            mdInst.update(sourceStr.getBytes());  
            // 获得密文  
            byte[] md = mdInst.digest();  
            // 把密文转换成十六进制的字符串形式  
            StringBuffer buf = new StringBuffer();  
            for (int i = 0; i < md.length; i++) {  
                int tmp = md[i];  
                if (tmp < 0)  
                    tmp += 256;  
                if (tmp < 16)  
                    buf.append("0");  
                buf.append(Integer.toHexString(tmp));  
            }  
            return buf.toString().toLowerCase();// 32位加密  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }
  
    private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",  
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };  
}
