package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "PRODUCT")
public class Product {

//    private String name;
//    private int price;
//    private int quantity;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userGenerator")
    @SequenceGenerator(name = "userGenerator", sequenceName = "seq")
    private long id;

    @Column(name = "NAME")
    private String name;


    @ManyToMany(mappedBy = "products",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Store> stores;
}
