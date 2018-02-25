package com.cyril.wechat.util;

import java.security.MessageDigest;

/**
 * Sha1加密工具类
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public abstract class Sha1Util {
	private static char hexDigits[] = { '0', '1', '2', '3', '4', 
			'5', '6', '7', '8', '9','a', 'b', 'c', 'd', 'e', 'f' };
	
	public static String getSha1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            return null;
        }
	}
}