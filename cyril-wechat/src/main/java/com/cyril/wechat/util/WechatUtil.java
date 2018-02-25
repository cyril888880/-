package com.cyril.wechat.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.cyril.wechat.bean.param.golbal.WechatGolbalAccessTokenParam;
import com.cyril.wechat.bean.param.menu.WechatMenuButtonParam;
import com.cyril.wechat.bean.result.WechatBaseResult;
import com.cyril.wechat.bean.result.golbal.WechatGolbalAccessTokenResult;
import com.cyril.wechat.bean.result.menu.WechatMenuResult;
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
	
	/**
	 * 创建自定义菜单
	 * @param wechatMenuButtonParam
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatBaseResult createMune(WechatMenuButtonParam wechatMenuButtonParam, String accessToken) throws WechatException {
		String url = WechatUrlUtil.getCreateMenuUrl(accessToken);
		return sendPostForWechat(url, WechatBaseResult.class, wechatMenuButtonParam);
	}
	
	/**
	 * 查询微信菜单
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatMenuResult findMenu(String accessToken) throws WechatException {
		String url = WechatUrlUtil.getFindMenuUrl(accessToken);
		return sendGetForWechat(url, WechatMenuResult.class);
	}
	
	/**
	 * 删除自定义菜单
	 * @param accessToken
	 * @return
	 * @throws WechatException 
	 */
	public static WechatBaseResult deleteMenu(String accessToken) throws WechatException {
		String url = WechatUrlUtil.getDeleteMenuUrl(accessToken);
		return sendGetForWechat(url, WechatBaseResult.class);
	}
	
	private static <T extends WechatBaseResult> T sendGetForWechat(String url, Class<T> resultType) throws WechatException {
		T result = HttpClientUtil.sendGetForWechat(url, resultType);
		checkWechatResult(result);
		return result;
	}
	
	private static <T extends WechatBaseResult> T sendPostForWechat(String url, Class<T> resultType, Object params) throws WechatException {
		T result = HttpClientUtil.sendPostForWechat(url, JSONObject.toJSONString(params), resultType);
		checkWechatResult(result);
		return result;
	}
	
	private static void checkWechatResult(WechatBaseResult result) throws WechatException{
		if(result.getErrcode() != 0) {
			throw new WechatException(result.getErrcode(), result.getErrmsg());
		}
	}
}