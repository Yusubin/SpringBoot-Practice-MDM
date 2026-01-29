package com.example.practice.controller;

import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.EmployeeInfoEntity;
import com.example.practice.entity.OrderInfoEntity;
import com.example.practice.entity.OrdersEntity;
import com.example.practice.service.OrderInfoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class OrderInfoController {
    private final OrderInfoService service;

    public OrderInfoController(OrderInfoService service) {
        this.service = service;
    }
    @GetMapping("/Orders")
    public String getViews(Model model, HttpSession session) {

        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<OrderInfoEntity> orderInfos = service.getAllViewList();
        System.out.println("OrderInfo size: " + orderInfos.size());
        orderInfos.forEach(e -> System.out.println(e.getOrderItemId()));
        model.addAttribute("orderInfos", orderInfos);

        return "OrdersInfoMain";
    }

    @GetMapping("/OrdersInfoModify")
    public String getViewsModify(Model model, HttpSession session) {

        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<OrderInfoEntity> orderInfos = service.getAllViewList();
        System.out.println("OrderInfo size: " + orderInfos.size());
        orderInfos.forEach(e -> System.out.println(e.getOrderItemId()));
        model.addAttribute("orderInfos", orderInfos);

        return "OrdersInfoMainModify";
    }
}
