package com.qmcaifu.messagecenter.facade.req;

import java.io.Serializable;

/**
 * @author zhuqiang
 * @version $Id: Account.java, v 0.1 2016年2月25日 下午3:12:56 zhuqiang Exp $
 */
public class Account implements Serializable{
	private static final long serialVersionUID = 4197790451791491562L;
	
	private String messagecenterId;
	private String money;
	public String getAccountId() {
		return messagecenterId;
	}
	public void setAccountId(String messagecenterId) {
		this.messagecenterId = messagecenterId;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
}
