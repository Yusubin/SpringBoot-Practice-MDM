package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LinkController {

@GetMapping("/")
//@ResponseBody
public String index() {
    return "Login";
}

@GetMapping("/Main")
public String main() {
        return "Main";
    }
}
