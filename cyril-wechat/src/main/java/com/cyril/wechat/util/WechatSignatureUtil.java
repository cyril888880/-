package com.cyril.wechat.util;

import java.util.Arrays;

import com.cyril.wechat.common.WechatPropertiesFileNameEnum;
import com.cyril.wechat.common.WechatPropertiesKeyEnum;
import com.cyril.wechat.helper.WechatSignatureHelper;

/**
 * 微信签名工具类
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public abstract class WechatSignatureUtil {
	private static String TOKEN;
	
	static {
		initialize();
	}
	
	private static void initialize() {
		TOKEN = PropertiesUtil.getPropertyString(WechatPropertiesKeyEnum.WECHAT_TOKEN.getPropertiesKey()
				, WechatPropertiesFileNameEnum.WECHAT.getName());
	}
	
	/**
	 * 验证微信签名
	 * @param signature
	 * @param signatureHelper
	 * @return
	 */
	public static boolean checkSignature(String signature, WechatSignatureHelper signatureHelper) {
		return signature.equals(getSignature(signatureHelper));
	}
	
	/**
	 * 获取微信签名
	 * @param signatureHelper
	 * @return
	 */
	public static String getSignature(WechatSignatureHelper signatureHelper) {
		return getSha1(sortArray(signatureHelper));
	}
	
	private static String[] sortArray(WechatSignatureHelper signatureHelper) {
		String[] seeds = new String[]{TOKEN,
        		signatureHelper.getTimestamp(),signatureHelper.getNonce()};
        Arrays.sort(seeds);
        return seeds;
	} 
	
	private static String getSha1(String[] seeds) {
		return Sha1Util.getSha1(appendSeeds(seeds));
	}
	
	private static String appendSeeds(String[] seeds) {
		StringBuffer content = new StringBuffer();
		
        for(int i = 0; i < seeds.length; i++){
            content.append(seeds[i]);
        }
        
        return content.toString();
	}
}