package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("tagLine", "Hello Spring MVC");
        return "Welcome";
    }

}
