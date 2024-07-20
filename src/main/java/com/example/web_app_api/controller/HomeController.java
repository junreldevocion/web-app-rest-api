package com.example.web_app_api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greeting() {
        return "hello world";
    }

    @GetMapping("/{id}")
    public String hello(@PathVariable int id) {
        return "bwesit" + id;
    }

}
