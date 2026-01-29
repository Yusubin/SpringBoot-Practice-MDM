package com.example.practice.controller;

import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.EmployeeInfoEntity;
import com.example.practice.entity.PayRollEntity;
import com.example.practice.service.PayrollService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class PayrollController {
    private final PayrollService service;

    public PayrollController(PayrollService service) {
        this.service = service;
    }

    @GetMapping("/Payrolls")
    public String getViews(Model model, HttpSession session) {

        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<PayRollEntity> payrolls = service.getAllViewList();
        System.out.println("payrolls size: " + payrolls.size());
        payrolls.forEach(e -> System.out.println(e.getPayrollId()));
        model.addAttribute("payrolls", payrolls);

        return "PayrollsMain";
    }
}
