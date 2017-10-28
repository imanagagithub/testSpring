package com.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestBean {

	public TestBean() {
	}

	private Integer no;

	private String testId;

	private String name;
}
