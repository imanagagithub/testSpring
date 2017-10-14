package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.domain.TestBean;

public interface TestMapper {

	@Select("SELECT * FROM TEST")
	List<TestBean> getTestBean();
}
