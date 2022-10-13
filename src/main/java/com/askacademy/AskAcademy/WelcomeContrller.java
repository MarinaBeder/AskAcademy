package com.askacademy.AskAcademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeContrller {
@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot heroku demo";
	}
	
}
