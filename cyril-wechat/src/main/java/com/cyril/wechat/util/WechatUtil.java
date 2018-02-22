package com.cyril.wechat.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyril.wechat.bean.param.golbal.WechatGolbalAccessTokenParam;
import com.cyril.wechat.bean.result.WechatBaseResult;
import com.cyril.wechat.bean.result.golbal.WechatGolbalAccessTokenResult;
import com.cyril.wechat.exception.WechatException;

/**
 * 微信工具类
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public abstract class WechatUtil {
	private static final Logger logger = LoggerFactory.getLogger(WechatUtil.class);
	/**
	 * 获取全局 access_token
	 * @param wechatGolbalAccessTokenParam
	 * @return
	 * @throws WechatException 
	 */
	public static WechatGolbalAccessTokenResult getGlobalAccessToken(WechatGolbalAccessTokenParam wechatGolbalAccessTokenParam) throws WechatException {
		String url = WechatUrlUtil.getGlobalAccessTokenUrl(wechatGolbalAccessTokenParam.getAppId(), 
				wechatGolbalAccessTokenParam.getAppSecret());
		return sendGetForWechat(url, WechatGolbalAccessTokenResult.class);
	}
	
	private static <T extends WechatBaseResult> T sendGetForWechat(String url, Class<T> resultType) throws WechatException {
		T result = HttpClientUtil.sendGetForWechat(url, resultType);
		checkWechatResult(result);
		return result;
	}
	
	private static void checkWechatResult(WechatBaseResult result) throws WechatException{
		if(result.getErrcode() != 0) {
			throw new WechatException(result.getErrcode(), result.getErrmsg());
		}
	}
}