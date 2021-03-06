package com.cyril.wechat.controller;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyril.wechat.bean.msg.event.WechatLocationEvent;
import com.cyril.wechat.bean.msg.event.WechatScanEvent;
import com.cyril.wechat.bean.msg.event.WechatSubscribeEvent;
import com.cyril.wechat.bean.msg.event.WechatUnsubscribeEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuClickEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuLocationSelectEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuPicPhotoOrAlbumEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuPicSysphotoEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuPicWeixinEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuScancodePushEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuScancodeWaitmsgEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuViewEvent;
import com.cyril.wechat.bean.msg.message.WechatImageMsg;
import com.cyril.wechat.bean.msg.message.WechatLinkMsg;
import com.cyril.wechat.bean.msg.message.WechatLocationMsg;
import com.cyril.wechat.bean.msg.message.WechatShortVideoMsg;
import com.cyril.wechat.bean.msg.message.WechatTextMsg;
import com.cyril.wechat.bean.msg.message.WechatVideoMsg;
import com.cyril.wechat.bean.msg.message.WechatVoiceMsg;
import com.cyril.wechat.common.WechatMsgEventTypeEnum;
import com.cyril.wechat.common.WechatMsgTypeEnum;
import com.cyril.wechat.helper.WechatSignatureHelper;
import com.cyril.wechat.util.WechatSignatureUtil;
import com.cyril.wechat.util.WechatXmlHelper;

/**
 * 微信controller
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
@SuppressWarnings("restriction")
@RequestMapping("/wechat")
@RestController
public class WechatController {
	private static final Logger logger = LoggerFactory.getLogger(WechatController.class);
	
	private static final String SUCCESS = "success";
	
	@RequestMapping(value = "/doin", method = RequestMethod.GET,
			produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	public String doin(
			@RequestParam(value="signature" ,required =true) String signature,
			@RequestParam(value="timestamp" ,required =true) String timestamp,
			@RequestParam(value="nonce" ,required =true) String nonce,
			@RequestParam(value="echostr" ,required =true) String echostr) {
		if(logger.isDebugEnabled()) {
			logger.debug("signature : {}, timestamp : {}, nonce : {}, echostr : {}", signature, timestamp, nonce, echostr);
			logger.debug("签名验证结果" + WechatSignatureUtil.checkSignature(signature, new WechatSignatureHelper(timestamp, nonce)));
		}
		
		return echostr;
	}
	
	@RequestMapping(value = "/doin", method = RequestMethod.POST,
			produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	public String doin(
			@RequestParam(value="signature" ,required = false) String signature,
			@RequestParam(value="timestamp" ,required = false) String timestamp,
			@RequestParam(value="nonce" ,required = false) String nonce,
			@RequestParam(value="echostr" ,required = false) String echostr,
			@RequestBody String xml) {
		logger.debug("xml : {}", xml);
		return processXml(xml);
	}
	
	private String processXml(String xml) {
		try {
			return processXml(new WechatXmlHelper(xml));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			logger.error("解析微信消息失败, 失败 XML 为: {}", xml);
			return SUCCESS;
		}
	}
	
	private String processXml(WechatXmlHelper wechatXmlHelper) throws JAXBException {
		switch (getMsgType(wechatXmlHelper)) {
		case EVENT :
			return processEvent(wechatXmlHelper);
		case TEXT :
			return processText(wechatXmlHelper.parseObject(WechatTextMsg.class));
		case IMAGE : 
			return processImage(wechatXmlHelper.parseObject(WechatImageMsg.class));
		case VOICE : 
			return processVoice(wechatXmlHelper.parseObject(WechatVoiceMsg.class));
		case VIDEO : 
			return processVideo(wechatXmlHelper.parseObject(WechatVideoMsg.class));
		case SHORT_VIDEO :
			return processShortVideo(wechatXmlHelper.parseObject(WechatShortVideoMsg.class));
		case LOCATION : 
			return processLocation(wechatXmlHelper.parseObject(WechatLocationMsg.class));
		case LINK : 
			return processLink(wechatXmlHelper.parseObject(WechatLinkMsg.class));
		default :
			return SUCCESS;
		}
	}
	
	private WechatMsgTypeEnum getMsgType(WechatXmlHelper wechatXmlHelper) {
		return WechatMsgTypeEnum.getMsgType(wechatXmlHelper.getElementText("MsgType"));
	}
	
	private String processText(WechatTextMsg msg) {
		return SUCCESS;
	}
	
	private String processImage(WechatImageMsg msg) {
		return SUCCESS;
	}
	
	private String processVoice(WechatVoiceMsg msg) {
		return SUCCESS;
	}
	
	private String processVideo(WechatVideoMsg msg) {
		return SUCCESS;
	}
	
	private String processShortVideo(WechatShortVideoMsg msg) {
		return SUCCESS;
	}
	
	private String processLocation(WechatLocationMsg msg) {
		return SUCCESS;
	}
	
	private String processLink(WechatLinkMsg msg) {
		return SUCCESS;
	}
	
	private String processEvent(WechatXmlHelper wechatXmlHelper) throws JAXBException {
		switch (getMsgEventType(wechatXmlHelper)) {
		case CLICK :
			return processClickEvent(wechatXmlHelper.parseObject(WechatMenuClickEvent.class));
		case VIEW :
			return processViewEvent(wechatXmlHelper.parseObject(WechatMenuViewEvent.class));
		case SCANCODE_PUSH : 
			return processScancodePushEvent(wechatXmlHelper.parseObject(WechatMenuScancodePushEvent.class));
		case SCANCODE_WAITMSG :
			return processScancodeWaitmsgEvent(wechatXmlHelper.parseObject(WechatMenuScancodeWaitmsgEvent.class));
		case PIC_SYSPHOTO :
			return processPicSysphotoEvent(wechatXmlHelper.parseObject(WechatMenuPicSysphotoEvent.class));
		case PIC_PHOTO_OR_ALBUM :
			return processPicPhotoOrAlbumEvent(wechatXmlHelper.parseObject(WechatMenuPicPhotoOrAlbumEvent.class));
		case PIC_WEIXIN :
			return processPicWeixinEvent(wechatXmlHelper.parseObject(WechatMenuPicWeixinEvent.class));
		case LOCATION_SELECT :
			return processLocationSelectEvent(wechatXmlHelper.parseObject(WechatMenuLocationSelectEvent.class));
		case SUBSCRIBE : 
			return processSubscribe(wechatXmlHelper.parseObject(WechatSubscribeEvent.class));
		case UNSUBSCRIBE :
			return processUnsubscribe(wechatXmlHelper.parseObject(WechatUnsubscribeEvent.class));
		case SCAN : 
			return processScan(wechatXmlHelper.parseObject(WechatScanEvent.class));
		case LOCATION :
			return processLocation(wechatXmlHelper.parseObject(WechatLocationEvent.class));
		default :
			return SUCCESS;
		}
	}
	
	private WechatMsgEventTypeEnum getMsgEventType(WechatXmlHelper wechatXmlHelper) {
		return WechatMsgEventTypeEnum.getMsgEventType(wechatXmlHelper.getElementText("Event"));
	}
	
	private String processClickEvent(WechatMenuClickEvent event) {
		return SUCCESS;
	}
	
	private String processViewEvent(WechatMenuViewEvent event) {
		return SUCCESS;
	}
	
	private String processScancodePushEvent(WechatMenuScancodePushEvent event) {
		return SUCCESS;
	}
	
	private String processScancodeWaitmsgEvent(WechatMenuScancodeWaitmsgEvent event) {
		return SUCCESS;
	}
	
	private String processPicSysphotoEvent(WechatMenuPicSysphotoEvent event) {
		return SUCCESS;
	}
	
	private String processPicPhotoOrAlbumEvent(WechatMenuPicPhotoOrAlbumEvent event) {
		return SUCCESS;
	}
	
	private String processPicWeixinEvent(WechatMenuPicWeixinEvent event) {
		return SUCCESS;
	}
	
	private String processLocationSelectEvent(WechatMenuLocationSelectEvent event) {
		return SUCCESS;
	}
	
	private String processSubscribe(WechatSubscribeEvent event) {
		return SUCCESS;
	}
	
	private String processUnsubscribe(WechatUnsubscribeEvent event) {
		return SUCCESS;
	}
	
	private String processScan(WechatScanEvent event) {
		return SUCCESS;
	}
	
	private String processLocation(WechatLocationEvent event) {
		return SUCCESS;
	}
}