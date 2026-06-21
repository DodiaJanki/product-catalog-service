package com.k8s.product_catalog_service.controller;


import com.k8s.product_catalog_service.entity.Product;
import com.k8s.product_catalog_service.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
}