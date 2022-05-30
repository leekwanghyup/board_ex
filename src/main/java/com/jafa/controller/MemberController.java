package com.jafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("auth")
public class MemberController {
	
	@GetMapping("/login")
	public String login(Model model) {
		return "member/login";
	}
	
	
}
