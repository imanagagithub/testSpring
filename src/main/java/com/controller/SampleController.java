package com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.TestBean;
import com.mapper.TestMapper;

@Controller
public class SampleController {

	@Autowired
	TestMapper testMapper;

	@RequestMapping(value = "/", method = GET)
	public String show() {

		TestBean testBean = this.testMapper.selectTestBeanByPrimaryKey("1");

		System.out.println(testBean.getName());
		System.out.println(testBean.getNo());

		return "test";
	}
}