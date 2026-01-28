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
    private final UserInfoRepository repo;

    public UserInfoController(UserInfoService service, UserInfoRepository repo) {
        this.service = service;
        this.repo = repo;
    }

    @PostMapping("/LoginCheck")
    public String login(@ModelAttribute LoginRequestDto dto, HttpSession session) {
        System.out.println("로그인 시도 userId: " + dto.getUserId());
        System.out.println("로그인 시도 userPassword: " + dto.getUserPassword());


        UserInfoEntity user = repo.findByUserId(dto.getUserId()).orElse(null);
        System.out.println("DB에서 조회한 user: " + user);


        if (user != null && user.getUserPassword().equals(dto.getUserPassword())) {
            // DTO에 세션용 정보 채우기
            dto.setUserId(user.getUserId());


            // 비밀번호는 세션에 안 넣는 것이 좋음
            dto.setUserPassword(null);
            System.out.println("로그인 성공, 세션에 저장할 DTO: " + dto);
            session.setAttribute("user", dto);
            return "redirect:/Main";
        } else {
            System.out.println("로그인 실패");

            return "redirect:/Login";
        }
    }




}
