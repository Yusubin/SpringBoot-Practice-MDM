package com.example.practice.controller;

import com.example.practice.model.dao.userInfoDAO;
import com.example.practice.model.vo.UserInfoVO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    @Autowired
    userInfoDAO dao;

    @RequestMapping("/LoginCheck")
    public String login(UserInfoVO vo, HttpSession session) throws Exception {
        UserInfoVO vo2 = dao.login(vo);
        if(vo2 != null) { //로그인에 성공했을 때
            session.setAttribute("user_id", vo2.getUser_id());
            return "Main";
        } else { //로그인에 실패했을 때
            return "Login";
        }
    }
}
