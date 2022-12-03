package com.example.demo.repositories;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 12/3/2022, Sat
 **/

public interface ProductRepository extends JpaRepository<Product, Long> {
}
