package com.example.practice.controller;

import jakarta.servlet.http.HttpSession;
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
 @GetMapping("/Login")
public String login() {
        return "Login";
    }



@GetMapping("/Logout")
public String logout(HttpSession session) {
    session.invalidate(); // 세션 전체 삭제
    return "redirect:/Login"; // 로그아웃 후 로그인 페이지로 이동
}

@GetMapping("/Main")
public String main() {
        return "Main";
    }
}
