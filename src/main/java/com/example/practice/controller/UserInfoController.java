package com.example.practice.controller;

import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.UserInfoEntity;
import com.example.practice.repository.UserInfoRepository;
import com.example.practice.service.UserInfoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserInfoController {

    private final UserInfoService service;

    public UserInfoController(UserInfoService service) {
        this.service = service;
    }

    @PostMapping("/LoginCheck")
    public String login(@ModelAttribute LoginRequestDto dto, HttpSession session) {

        System.out.println("로그인 시도 userId: " + dto.getUserId());

        LoginRequestDto loginUser = service.login(dto);

        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            return "redirect:/Main";
        } else {
            return "redirect:/Login";
        }
    }
}
