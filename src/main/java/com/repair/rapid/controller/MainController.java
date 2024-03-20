package com.repair.rapid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "hello sagar";
	}
	
}
