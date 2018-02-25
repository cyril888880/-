package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * media_id类型菜单
 * 下发消息（除文本消息）用户点击media_id类型按钮后，
 * 微信服务器会将开发者填写的永久素材id对应的素材下发给用户，
 * 永久素材类型可以是图片、音频、视频、图文消息。
 * 请注意：永久素材id必须是在“素材管理/新增永久素材”接口上传后获得的合法id
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatMediaIdMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = -5748841537217547316L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.MEDIA_ID;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String media_id;
	
	public WechatMediaIdMenuParam() {
		super();
	}

	public WechatMediaIdMenuParam(String name, String media_id) {
		super(name);
		this.media_id = media_id;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getType() {
		return type.getType();
	}

	@Override
	public String toString() {
		return "WechatMediaIdMenuParam [type=" + type + ", media_id=" + media_id + "]";
	}
}