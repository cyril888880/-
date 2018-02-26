package com.cyril.wechat.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.cyril.wechat.bean.param.golbal.WechatGolbalAccessTokenParam;
import com.cyril.wechat.bean.param.menu.WechatMenuButtonParam;
import com.cyril.wechat.bean.param.menu.WechatMenuConditionalButtonParam;
import com.cyril.wechat.bean.param.menu.WechatMenuConditionalDeleteParam;
import com.cyril.wechat.bean.param.menu.WechatMenuConditionalTestParam;
import com.cyril.wechat.bean.result.WechatBaseResult;
import com.cyril.wechat.bean.result.golbal.WechatGolbalAccessTokenResult;
import com.cyril.wechat.bean.result.menu.WechatCreateConditionalMenuResult;
import com.cyril.wechat.bean.result.menu.WechatMenuConfigResult;
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
	public static WechatGolbalAccessTokenResult getGlobalAccessToken(WechatGolbalAccessTokenParam params) throws WechatException {
		String url = WechatUrlUtil.getGlobalAccessTokenUrl(params.getAppId(), 
				params.getAppSecret());
		return sendGetForWechat(url, WechatGolbalAccessTokenResult.class);
	}
	
	/**
	 * 创建自定义菜单
	 * @param wechatMenuButtonParam
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatBaseResult createMune(WechatMenuButtonParam params, String accessToken) throws WechatException {
		String url = WechatUrlUtil.getCreateMenuUrl(accessToken);
		return sendPostForWechat(url, WechatBaseResult.class, params);
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
	
	/**
	 * 创建微信个性化菜单
	 * @param params
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatCreateConditionalMenuResult createConditionalMenu(WechatMenuConditionalButtonParam params, String accessToken) throws WechatException {
		String url = WechatUrlUtil.createConditionalMenuUrl(accessToken);
		return sendPostForWechat(url, WechatCreateConditionalMenuResult.class, params);
	}
	
	/**
	 * 删除微信个性化菜单
	 * @param params
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatBaseResult deleteConditionalMenu(WechatMenuConditionalDeleteParam params, String accessToken) throws WechatException {
		String url = WechatUrlUtil.deleteConditionalMenuUrl(accessToken);
		return sendPostForWechat(url, WechatBaseResult.class, params);
	}
	
	/**
	 * 测试个性化菜单匹配结果
	 * @param params
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatMenuResult testConditionalMenu(WechatMenuConditionalTestParam params, String accessToken) throws WechatException {
		String url = WechatUrlUtil.testConditionMenuUrl(accessToken);
		return sendPostForWechat(url, WechatMenuResult.class, params);
	}
	
	/**
	 * 获取微信自定义菜单配置
	 * @param accessToken
	 * @return
	 * @throws WechatException
	 */
	public static WechatMenuConfigResult getWechatMenuConfig(String accessToken) throws WechatException {
		String url = WechatUrlUtil.configMenuUrl(accessToken);
		return sendGetForWechat(url, WechatMenuConfigResult.class);
	}
	
	private static <T extends WechatBaseResult> T sendGetForWechat(String url, Class<T> resultType) throws WechatException {
		printUrl(url);
		T result = HttpClientUtil.sendGetForWechat(url, resultType);
		checkWechatResult(result);
		return result;
	}
	
	private static <T extends WechatBaseResult> T sendPostForWechat(String url, Class<T> resultType, Object params) throws WechatException {
		printUrl(url);
		T result = HttpClientUtil.sendPostForWechat(url, JSONObject.toJSONString(params), resultType);
		checkWechatResult(result);
		return result;
	}
	
	private static void printUrl(String url) {
		logger.debug("请求接口 : {}", url);
	}
	
	private static void checkWechatResult(WechatBaseResult result) throws WechatException{
		if(result.getErrcode() != 0) {
			throw new WechatException(result.getErrcode(), result.getErrmsg());
		}
	}
}