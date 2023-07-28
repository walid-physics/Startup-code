package com.luv2code.springcoredemo;

import com.luv2code.springcoredemo.Product;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierService {
    public List<Supplier> getAllSuppliers() {
        // Retrieve products from a database or data source
        // For now, we'll use a hardcoded list of products as a placeholder
        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(new Supplier("err",1233));

        return suppliers;
    }
}
