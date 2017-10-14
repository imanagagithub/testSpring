package com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/", method = GET)
	public String show() {

		List<Map<String, Object>> result = jdbcTemplate.queryForList("select * from test");

		result.forEach(x -> {
			System.out.println(x);
		});

		return "test";
	}
}