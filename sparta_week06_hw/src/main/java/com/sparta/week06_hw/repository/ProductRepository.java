package com.sparta.week06_hw.repository;

import com.sparta.week06_hw.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}