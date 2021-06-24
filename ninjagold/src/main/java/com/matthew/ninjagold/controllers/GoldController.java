package com.matthew.ninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
//	@RequestMapping(value"/", method=RequestMethod.GET)
//	@RequestMapping(value"/", method=RequestMethod.POST)
	
	@GetMapping("/")
	public String index(HttpSession session, Model viewModel) {
		ArrayList<String> activityList = new ArrayList<String>();
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("activity") == null) {
			session.setAttribute("activity", activityList);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		return "gold.jsp";
	}
	
	@PostMapping("/findGold")
	public String gold(@RequestParam("building") String building, HttpSession session) {
		Random r = new Random();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		System.out.println(formatter.format(now));
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		int gold = (int)session.getAttribute("gold");
		int goldThisTurn;
		if(building.equals("farm")) {
			goldThisTurn = r.nextInt((20-10) + 1) + 10;
			activity.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
		} else if (building.equals("cave")) {
			goldThisTurn = r.nextInt((10-5) + 1) + 5;
			activity.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
		} else if(building.equals("house")) {
			// do house stuff
			goldThisTurn = r.nextInt((5-2) + 1) + 2;
			activity.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
		} else {
			// do casino stuff
			goldThisTurn = r.nextInt((50 + 50) + 1) - 50;
			if(goldThisTurn < 0) {
				activity.add(String.format("You entered a %s and lost %d gold, ouch! %s", building, goldThisTurn, formatter.format(now)));
			} else {
			activity.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
			}
		} 
		int totalGold = gold += goldThisTurn;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/";
	}
}
