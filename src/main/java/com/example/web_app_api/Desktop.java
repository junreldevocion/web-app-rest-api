package com.example.web_app_api;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.err.println("compiling using desktop");
    }
}
