package com.Application.pharmacy.repository;


import com.Application.pharmacy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
