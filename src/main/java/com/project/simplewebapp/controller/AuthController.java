package com.project.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@RequestMapping("/login")
	public String login() {
		return "Welcome this is login controller";
	}
}