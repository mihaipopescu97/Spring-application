package com.example.demo.entities;

import com.example.demo.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}
