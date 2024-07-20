package com.example.web_app_api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.web_app_api.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(
            Arrays.asList(new Product(1, "iphone", 5000), new Product(2, "laptop", 2000),
                    new Product(3, "desktop", 50000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst()
                .orElse(new Product(0, null, 0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;

        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;

        products.set(index, prod);

    }

    public void deleteProduct(int prodId) {
        int index = 0;

        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == prodId)
                index = i;

        products.remove(index);
    }
}
