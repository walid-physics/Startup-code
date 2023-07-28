package com.luv2code.springcoredemo;

import java.time.LocalDate;

public class Product {
    private long productid; // (Primary key field)
    private String name;
    private double unitPrice;
    private int quantityInStock;
    private LocalDate dateSupplied; //(e.g. 2023-05-31)
    private Supplier supplier;

    Product(long productid, String name, double unitPrice, int quantityInStock, LocalDate dateSupplied) {
        this.productid = productid;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateSupplied = dateSupplied;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
