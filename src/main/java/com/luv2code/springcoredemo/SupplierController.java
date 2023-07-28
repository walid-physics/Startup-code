package com.luv2code.springcoredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/supplier")
    public List<Supplier> showProducts() {
        List<Supplier> suppliers = supplierService.getAllSuppliers();
        //model.addAttribute("products", products);
        return suppliers;
    }
}
