package com.k8s.product_catalog_service.repository;

import com.k8s.product_catalog_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, Long> {
}