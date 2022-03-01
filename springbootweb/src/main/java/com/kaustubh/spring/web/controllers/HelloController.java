package com.kaustubh.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam String name) {
		return "<h2>hellod</h2> " + name;
	}
}
