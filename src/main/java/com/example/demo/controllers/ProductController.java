package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.entities.Store;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return repository.findAll();
    }
}
