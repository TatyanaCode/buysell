package com.example.buysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author danilova.tatyana 05.02.2023
 */
@Controller
public class ProductController {
    @GetMapping("/")
    public String products(){
        return "products";
    }
}
