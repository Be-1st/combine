package com.personal_color.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {

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