package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping()
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
