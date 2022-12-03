package com.example.demo.controllers;

import com.example.demo.entities.Store;
import com.example.demo.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreRepository repository;

    @PostMapping
    public Store create(@RequestBody final Store store) {
        return repository.save(store);
    }

    @GetMapping
    public List<Store> getAll() {
        return repository.findAll();
    }
}
