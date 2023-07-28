package com.luv2code.springcoredemo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        // Retrieve products from a database or data source
        // For now, we'll use a hardcoded list of products as a placeholder
        List<Product> products = new ArrayList<>();
        Product p = new Product(100, "Product 1", 100,12, LocalDate.of(2000,1,1));
        p.setSupplier(new Supplier("ssdsdd",12));
        products.add(p);

        return products;
    }
}