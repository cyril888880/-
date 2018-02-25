package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * pic_sysphoto类型菜单
 * 弹出系统拍照发图用户点击按钮后，微信客户端将调起系统相机，
 * 完成拍照操作后，会将拍摄的相片发送给开发者，并推送事件给开发者，
 * 同时收起系统相机，随后可能会收到开发者下发的消息
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatPicSysphotoMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = -8846581178078939573L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.PIC_SYSPHOTO;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;

	public WechatPicSysphotoMenuParam() {
		super();
	}

	public WechatPicSysphotoMenuParam(String name, String key) {
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
		return "WechatPicSysphotoMenuParam [type=" + type + ", key=" + key + "]";
	}
}