package com.qmcaifu.messagecenter.biz.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qmcaifu.messagecenter.facade.AccountService;
import com.qmcaifu.messagecenter.facade.req.Account;
import com.qmcaifu.messagecenter.facade.resp.AccountResp;

/**
 * @author zhuqiang
 * @version $Id: AccountImpl.java, v 0.1 2016年2月25日 下午3:17:29 zhuqiang Exp $
 */
//@Service
public class AccountImpl implements AccountService {

	@Override
	public AccountResp deposit(Account messagecenter) {
		
		try{
			
			//insert dal
			System.out.println("insert insert insert----");
			
			System.out.println("lock lock lock---");
			
			System.out.println("done done done");
			
		} catch (Exception e){
			
		}
		
		
		return new AccountResp();
	}

}
