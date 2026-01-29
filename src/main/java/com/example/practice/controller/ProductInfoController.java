package com.example.practice.controller;

import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.EmployeeInfoEntity;
import com.example.practice.entity.ProductInfoEntity;
import com.example.practice.service.ProductInfoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductInfoController {
    private final ProductInfoService service;

    public ProductInfoController(ProductInfoService service) {
        this.service = service;
    }

    @GetMapping("/Products")
    public String getView_(Model model, HttpSession session){
        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<ProductInfoEntity> products = service.getAllViewList();
        System.out.println("products size: " + products.size());
        products.forEach(e -> System.out.println(e.getProductCategory()));
        model.addAttribute("products", products);

        return "Main";
    }

    @GetMapping("/ProductsModify")
    public String getViewModify_(Model model, HttpSession session){
        LoginRequestDto user = (LoginRequestDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/Login";
        }
        model.addAttribute("user", user);

        System.out.println("Session userId: " +  model.addAttribute("user", user));
        List<ProductInfoEntity> products = service.getAllViewList();
        System.out.println("products size: " + products.size());
        products.forEach(e -> System.out.println(e.getProductCategory()));
        model.addAttribute("products", products);

        return "MainModify";
    }
}
