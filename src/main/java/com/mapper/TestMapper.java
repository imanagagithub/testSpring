package com.mapper;

import java.util.List;

import com.domain.TestBean;

public interface TestMapper {

	List<TestBean> getTestBean();

	TestBean selectTestBeanByPrimaryKey(String no);
}
