package com.qmcaifu.messagecenter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qmcaifu.messagecenter.dal.dao.BaseLogMapper;
import com.qmcaifu.messagecenter.dal.model.BaseLog;
import com.qmcaifu.messagecenter.service.BaseService;

/**
 * @author zhuqiang
 * @version $Id: BaseServiceImpl.java, v 0.1 2016年3月8日 下午5:02:47 zhuqiang Exp $
 */
@Service("baseService")
public class BaseServiceImpl implements BaseService{
	
	@Autowired
	private BaseLogMapper baseLogMapper;

	@Override
	public List<BaseLog> queryList() {
		return baseLogMapper.selectAll();
	}

	@Override
	public <T> List<T> getMax(List<T> list) {
		List<T> v2 = list.subList(1, 2);
		return v2;
	}
}
