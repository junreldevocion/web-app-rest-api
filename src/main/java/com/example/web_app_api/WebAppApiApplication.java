package com.example.web_app_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebAppApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebAppApiApplication.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
