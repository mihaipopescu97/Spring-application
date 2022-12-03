package com.example.demo.entities;

import com.example.demo.enums.Role;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userGenerator")
    @SequenceGenerator(name = "userGenerator", sequenceName = "seq")
    private long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Store> stores = new ArrayList<>();

}
