package com.qmcaifu.messagecenter.service;

import java.util.List;

import com.qmcaifu.messagecenter.dal.model.BaseLog;

public interface BaseService {
	List<BaseLog> queryList();
	public <T> List<T> getMax(List<T> list);
}
