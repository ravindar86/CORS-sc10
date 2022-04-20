package com.spring.security.corssc10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main(){
        return "main.html";
    }

    @PostMapping("/test")
    @ResponseBody
    //@CrossOrigin("*")     // allows from all origins to access the method
    public String test() {
        System.out.println("Inside Test method...");
        return "Testing CORS!";
    }
}
