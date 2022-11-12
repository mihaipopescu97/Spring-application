package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.entities.UserContainer;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String getAllUsers() {
        return "OK";
    }

    @PutMapping()
    public User createUser(@RequestBody User user) {
        return user;
    }

    @PostMapping()
    public UserContainer testPost() {
        final UserContainer userContainer = new UserContainer();

        return userContainer;
    }
}
