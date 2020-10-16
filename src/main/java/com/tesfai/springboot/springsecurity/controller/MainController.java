package com.tesfai.springboot.springsecurity.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tesfai.springboot.springsecurity.dto.UserRegistrationDto;

@Controller
public class MainController {
	
    @GetMapping("/")
    public String root(Model model,Principal principal) {
    	
    	model.addAttribute("user", principal.getName());
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}
