package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单信息
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuSelfMenuInfoResult implements Serializable {
	private static final long serialVersionUID = -6968503391551946194L;
	
	/**
	 * 菜单按钮
	 */
	List<WechatMenuConfigButtonResult> button;

	public List<WechatMenuConfigButtonResult> getButton() {
		return button;
	}

	public void setButton(List<WechatMenuConfigButtonResult> button) {
		this.button = button;
	}

	@Override
	public String toString() {
		return "WechatMenuSelfMenuInfoResult [button=" + button + "]";
	}
}