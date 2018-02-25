package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * view_limited类型菜单
 * 跳转图文消息URL用户点击view_limited类型按钮后，
 * 微信客户端将打开开发者在按钮中填写的永久素材id对应的图文消息URL，
 * 永久素材类型只支持图文消息。
 * 请注意：永久素材id必须是在“素材管理/新增永久素材”接口上传后获得的合法id
 *  
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatViewLimitedMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = 6474293604102216164L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.VIEW_LIMITED;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String media_id;

	public WechatViewLimitedMenuParam() {
		super();
	}

	public WechatViewLimitedMenuParam(String name, String media_id) {
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
		return "WechatViewLimitedMenuParam [type=" + type + ", media_id=" + media_id + "]";
	}
}