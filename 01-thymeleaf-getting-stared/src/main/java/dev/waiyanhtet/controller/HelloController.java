package dev.waiyanhtet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String hello(ModelMap model) {
		model.put("title", "Hello Thymeleaf View");
		return "hello";
	}
}
