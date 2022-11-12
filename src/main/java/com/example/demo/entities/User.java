package com.example.demo.entities;

import com.example.demo.enums.Role;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/

public class User {

    private String username;
    private String password;
    private Role role;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
