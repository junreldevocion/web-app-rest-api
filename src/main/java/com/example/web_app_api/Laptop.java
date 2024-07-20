package com.example.web_app_api;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("compiling an error using laptop");
    }
}
