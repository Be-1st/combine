package com.personal_color.demo.controller;

import com.personal_color.demo.service.FileInfoService;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller

public class MainController {

    @Autowired
    FileInfoService service;

    @GetMapping("/hello")
    public String hello() {
        return "web";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }

    @GetMapping("/develop")
    public String develop(){
        return "develop";
    }


}
