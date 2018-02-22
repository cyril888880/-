package com.cyril.wechat.util;

import com.cyril.wechat.bean.param.golbal.WechatGolbalAccessTokenParam;
import com.cyril.wechat.bean.result.golbal.WechatGolbalAccessTokenResult;

/**
 * 微信工具类
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public abstract class WechatUtil {
	/**
	 * 获取全局 access_token
	 * @param wechatGolbalAccessTokenParam
	 * @return
	 */
	public static WechatGolbalAccessTokenResult getGlobalAccessToken(WechatGolbalAccessTokenParam wechatGolbalAccessTokenParam) {
		String url = WechatUrlUtil.getGlobalAccessTokenUrl(wechatGolbalAccessTokenParam.getAppId(), 
				wechatGolbalAccessTokenParam.getAppSecret());
		return HttpClientUtil.sendGetForWechat(url, WechatGolbalAccessTokenResult.class);
	}
}