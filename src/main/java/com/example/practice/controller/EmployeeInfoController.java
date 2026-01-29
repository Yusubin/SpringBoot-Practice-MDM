package com.example.practice.controller;

import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.EmployeeInfoEntity;
import com.example.practice.service.EmployeeInfoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeInfoController {
    private final EmployeeInfoService service;

    public EmployeeInfoController(EmployeeInfoService service) {
        this.service = service;
    }


    @GetMapping("/Employee")
    public String getViews(Model model, HttpSession session) {

        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<EmployeeInfoEntity> employees = service.getAllViewList();
        System.out.println("employees size: " + employees.size());
        employees.forEach(e -> System.out.println(e.getEmployeeName()));
        model.addAttribute("employees", employees);

        return "EmployeeMain";
    }
}
