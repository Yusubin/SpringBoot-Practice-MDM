package com.example.practice.controller;

import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.OrderInfoEntity;
import com.example.practice.entity.SalaryInfoEntity;
import com.example.practice.service.SalaryInfoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SalaryInfoController {
    private final SalaryInfoService service;

    public SalaryInfoController(SalaryInfoService service) {
        this.service = service;
    }

    @GetMapping("/Salarys")
    public String getViews(Model model, HttpSession session) {

        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<SalaryInfoEntity> salarys = service.getAllViewList();
        System.out.println("salarys size: " + salarys.size());
        salarys.forEach(e -> System.out.println(e.getSalaryBase()));
        model.addAttribute("salarys", salarys);

        return "SalaryInfoMain";
    }
}
