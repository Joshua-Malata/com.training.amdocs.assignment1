package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping(method=RequestMethod.GET)
	public String greet(Model map) {
		System.out.println("Inside controller method..");
		map.addAttribute("msg", "Hello Form Spring MVC");
		return "home";
	}
	
}
