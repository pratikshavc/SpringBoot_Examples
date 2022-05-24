package com.hsbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p1")
public class firstcontroller {
	
	@RequestMapping("/first")
	public String m1() {
		return "first controller method execute";
	}

	@RequestMapping("/second")
	public String m2() {
		return "second controller method execute";
	}
}
