package com.example.web_app_api.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
