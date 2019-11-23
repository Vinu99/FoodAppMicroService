package com.food.contollers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

	@RequestMapping("/checkAPI")
	public String getCurrency() {
		return "Successfull";
	}
}
