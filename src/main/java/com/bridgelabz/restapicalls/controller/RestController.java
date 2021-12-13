package com.bridgelabz.restapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class RestController {
    @RequestMapping(value={"", "/","home"})
    public String sayHello(){
        return "Hello From Bridgelabz...";
    }
    
}
