package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 图文消息的信息
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuConfigNewsInfoResullt implements Serializable {
	private static final long serialVersionUID = 6816086820314417539L;
	List<WechatMenuConfigButtonResult> list;

	public List<WechatMenuConfigButtonResult> getList() {
		return list;
	}

	public void setList(List<WechatMenuConfigButtonResult> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "WechatMenuConfigNewsInfoResullt [list=" + list + "]";
	}
}