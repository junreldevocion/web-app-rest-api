package com.example.web_app_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web_app_api.model.Product;
import com.example.web_app_api.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>(
    // Arrays.asList(new Product(1, "iphone", 5000), new Product(2, "laptop", 2000),
    // new Product(3, "desktop", 50000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);

    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
