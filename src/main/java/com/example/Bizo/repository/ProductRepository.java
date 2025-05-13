package com.example.Bizo.repository;

import com.example.Bizo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByNameContaining(String name);
    Product findByPriceLessThan(Double price);
}
