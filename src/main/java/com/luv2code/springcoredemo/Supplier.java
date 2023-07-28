package com.luv2code.springcoredemo;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private int supplierId;  // (Primary Key field)
    private String name; //(required field) (e.g. Hallmark Agro Inc., Iowa Farms etc.)
    private List<Product> products;
    private String phone;

    Supplier(String name, int supplierId){
        this.supplierId =supplierId;
        this.name = name;
        products = new ArrayList<>();
    }
    Supplier(String name, int supplierId, String phone){
        this.supplierId =supplierId;
        this.name = name;
        this.phone = phone;
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
