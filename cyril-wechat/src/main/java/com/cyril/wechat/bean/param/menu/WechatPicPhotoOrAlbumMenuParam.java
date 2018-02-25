package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * pic_photo_or_album类型菜单
 * 弹出拍照或者相册发图用户点击按钮后，
 * 微信客户端将弹出选择器供用户选择“拍照”或者“从手机相册选择”。
 * 用户选择后即走其他两种流程
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatPicPhotoOrAlbumMenuParam  extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = 5600513607546282124L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.PIC_PHOTO_OR_ALBUM;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;
	
	public WechatPicPhotoOrAlbumMenuParam() {
		super();
	}

	public WechatPicPhotoOrAlbumMenuParam(String name, String key) {
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
		return "WechatPicPhotoOrAlbumMenuParam [type=" + type + ", key=" + key + "]";
	}
}