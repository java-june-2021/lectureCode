package com.matthew.havingfun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping(value="/telljoke", method=RequestMethod.POST)
	public String receiveJoke(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("joke") String joke, Model viewModel) {
		viewModel.addAttribute("nameForFrontEnd", name);
		viewModel.addAttribute("locationForFrontEnd", location);
		viewModel.addAttribute("jokeFrontEnd", joke);
		return "joke.jsp";
	}
	
	@RequestMapping(value="/favcolor/{color}", method=RequestMethod.GET)
	public String color(Model viewModel, @PathVariable("color") String favcolor) {
		viewModel.addAttribute("favcolor", favcolor);
		return "favcolor.jsp";
	}
	
	
}
