package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/

@Entity
@Table(name = "STORE")
@Getter
@Setter
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userGenerator")
    @SequenceGenerator(name = "userGenerator", sequenceName = "seq")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User owner;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.EAGER)
    @JoinTable(
            name = "product_store",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    @Column(name = "NAME")
    private String name;

//    private List<Product> products;
//
//    private List<User> customers;
//
//    public User getOwner() {
//        return owner;
//    }
//
//    public void setOwner(User owner) {
//        this.owner = owner;
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//
//    public List<User> getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(List<User> customers) {
//        this.customers = customers;
//    }
}
