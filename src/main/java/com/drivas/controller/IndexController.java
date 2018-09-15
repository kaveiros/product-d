package com.drivas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drivas.commands.UserCommand;
import com.drivas.domain.User;

@Controller
public class IndexController {
	
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
		
		return "redirect:/products";
		
	}

}
