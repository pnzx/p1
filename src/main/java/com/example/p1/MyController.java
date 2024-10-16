package com.example.p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

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

	@PostMapping("/ex03/answer")
	public String ex03Answer(@RequestParam("mname") String mname,
			@RequestParam("color") String color, Model mo) {
		mo.addAttribute(mname, mname);
		mo.addAttribute(color, color);
		return "ex03Answer";
	}

	@GetMapping("/bread")
	public String bread() {
		return "bread";
	}

	@PostMapping("/bread/answer")
	public String breadAnswer(@RequestParam("bread") String bread,
			@RequestParam("price") int price,
			@RequestParam("quantity") int quantity, Model mo){
				mo.addAttribute("bread", bread);
				mo.addAttribute("quantity", quantity);
				int total=0;
				total=quantity*price;
				mo.addAttribute("total", total);
				return "breadAnswer";
					}
	
	@GetMapping("/q06")
	public String q06() {
		return "q06";
	}
	
	@GetMapping("/q06/a")
	public String a() {
		return "a";
	}
	
	@GetMapping("/q06/b")
	public String b() {
		return "b";
	}
	
	@PostMapping("/q06/aa")
	public String aanswer(@RequestParam("first") String first,
			@RequestParam("secend") String secend, Model mo) {
		mo.addAttribute("first", first);
		mo.addAttribute("secend", secend);
		return "aanswer";
	}
	
	@PostMapping("/q06/bb")
	public String banswer(@RequestParam("job") String job, Model mo) {
		mo.addAttribute("job", job);

		return "banswer";
	}

}