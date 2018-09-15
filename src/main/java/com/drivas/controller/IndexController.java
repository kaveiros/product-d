package com.drivas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String welcome() {
		
		return "welcome";
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	private String login() {
		
		return "";
		
	}

}
