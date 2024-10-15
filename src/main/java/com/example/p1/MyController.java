package com.example.p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/ex01")
	public String ex01() {
		return "ex01";
	}

	@PostMapping("/ex01/answer")
	public String ex01Answer(@RequestParam(name = "mid") String mid,
			@RequestParam(name = "pass") String pass, Model mo) {
		mo.addAttribute("mid", mid);
		mo.addAttribute("pass", pass);
		return "ex01Answer";
	}

	@GetMapping("/wise")
	public String wise() {
		return "wise";
	}

	@PostMapping("/wise/answer")
	public String wiseAnswer(@RequestParam(name = "wise") String wise,
			@RequestParam(name = "say") String say, Model mo) {
		mo.addAttribute("wise", wise);
		mo.addAttribute("say", say);
		return "wiseAnswer";
	}

	@GetMapping("/ex02")
	public String ex02() {
		return "ex02";
	}

	@PostMapping("/ex02/answer")
	public String ex02Answer(@RequestParam("mname") String mname,
			@RequestParam("po") String po, Model mo) {
		mo.addAttribute("mname", mname);
		mo.addAttribute("po", po);
		int salary = 0;
		switch (po) {
			case "사원" -> salary = 3500;
			case "대리" -> salary = 5000;
			case "팀장" -> salary = 7000;
			case "임원" -> salary = 9900;
		}
		mo.addAttribute("salary", salary);
		return "ex02Answer";
	}

	@Getmapping("/ex03")
	public String ex03() {
		return "ex03";
	}

	@PostMapping("/ex03/answer")
	public String ex03Answer(@RequestParam("mname") String mname,
			@RequestParam("color") String color, Model mo) {
		mo.addAttribute(mname, mname);
		mo.addAttribute(color, color);
		return "ex03Answer";
	}

}