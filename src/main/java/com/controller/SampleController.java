package com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

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

		List<TestBean> list = this.testMapper.getTestBean();

		list.forEach(x -> {
			System.out.println(x.getNo());
			System.out.println(x.getName());
		});

		return "test";
	}
}