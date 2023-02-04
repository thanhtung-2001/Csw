package com.example.csw.repository;

import com.example.csw.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepsitory extends JpaRepository<Product,Long> {
}
