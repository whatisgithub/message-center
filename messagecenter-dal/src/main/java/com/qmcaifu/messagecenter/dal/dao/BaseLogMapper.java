package com.qmcaifu.messagecenter.dal.dao;

import java.util.List;

import com.qmcaifu.messagecenter.dal.model.BaseLog;

public interface BaseLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseLog record);

    int insertSelective(BaseLog record);

    BaseLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseLog record);

    int updateByPrimaryKeyWithBLOBs(BaseLog record);

    int updateByPrimaryKey(BaseLog record);

	List<BaseLog> selectAll();
}