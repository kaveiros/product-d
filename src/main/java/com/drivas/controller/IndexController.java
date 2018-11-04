package com.drivas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drivas.commands.UserCommand;
import com.drivas.domain.User;
import com.drivas.services.UserService;

@Controller
public class IndexController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("userCommand", new UserCommand());
		return "welcome";
	}
	
	
	@RequestMapping(value = "/do.login", method = RequestMethod.POST)
	private String login(@Valid UserCommand userCommand, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			
			return "redirect:/";
		}
		userService.login(userCommand.getUserEmail());
		
		return "redirect:/products";
		
	}

}
