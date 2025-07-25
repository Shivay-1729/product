package com.Saurabh.product.repository;

import com.Saurabh.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
