
package com.cyril.wechat.bean.param.menu;
import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * scancode_push类型菜单
 * 扫码推事件用户点击按钮后，微信客户端将调起扫一扫工具，
 * 完成扫码操作后显示扫描结果（如果是URL，将进入URL
 * 且会将扫码的结果传给开发者，开发者可以下发消息
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatScancodePushMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = 7814436606069830076L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.SCANCODE_PUSH;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;

	public WechatScancodePushMenuParam() {
		super();
	}

	public WechatScancodePushMenuParam(String name, String key) {
		super(name);
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type.getType();
	}

	@Override
	public String toString() {
		return "WechatsSancodePushMenuParam [type=" + type + ", key=" + key + "]";
	}
}
