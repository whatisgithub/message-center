package com.qmcaifu.messagecenter.facade;

import com.qmcaifu.messagecenter.facade.req.Account;
import com.qmcaifu.messagecenter.facade.resp.AccountResp;

/**
 * @author zhuqiang
 * @version $Id: AccountService.java, v 0.1 2016年2月25日 下午3:12:14 zhuqiang Exp $
 */
public interface AccountService {
	public AccountResp deposit(Account messagecenter);
}
