package com.marvin.model;

public class DingdingNotice {//最终给钉钉发送的结构体

	private String msgtype = "text";//发送的文本类型
	
	protected String phone;//手机号

	protected boolean isAll;//是否是通知所有的手机号
	
	private DingText text;//发送的消息内容

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isAll() {
		return isAll;
	}

	public void setAll(boolean isAll) {
		this.isAll = isAll;
	}

	public DingText getText() {
		return text;
	}

	public void setText(DingText text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "DingdingNotice [msgtype=" + msgtype + ", phone=" + phone + ", isAll=" + isAll + ", text=" + text + "]";
	}

}
