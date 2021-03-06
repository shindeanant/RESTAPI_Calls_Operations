package com.bridgelabz.restapicalls.controller;

import com.bridgelabz.restapicalls.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@org.springframework.web.bind.annotation.RestController


@RequestMapping("/hello")
public class RestController {
    @RequestMapping(value={"", "/","home"})
    public String sayHello(){
        return "Hello From Bridgelabz.";
    }
    @RequestMapping(value={"/query"}, method=RequestMethod.GET)
    public String sayHello(@RequestParam(value="name") String name) {
        return "Hello" + name + "From Bridgelabz";
    }
    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloPara(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
    }
}
