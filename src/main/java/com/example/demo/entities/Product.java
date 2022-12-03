package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@Getter
@Setter
public class Product {

    private String name;
    private int price;

    private int quantity;
}
