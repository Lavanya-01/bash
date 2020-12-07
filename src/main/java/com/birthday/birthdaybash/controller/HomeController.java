/**
 * 
 */
package com.birthday.birthdaybash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		return "login";
	}
	
	@RequestMapping("/bash")
	public String bash(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		return "bash";
	}
	
	@RequestMapping("/foodies")
	public String foodies(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		return "foodies";
	}
}
