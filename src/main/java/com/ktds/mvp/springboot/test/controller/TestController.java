package com.ktds.mvp.springboot.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {
    
	@GetMapping(value = "")
	public String test() {
		return "test";
	}
}
