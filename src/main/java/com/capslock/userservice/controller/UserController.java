package com.capslock.userservice.controller;

import com.capslock.userservice.domain.User;
import com.capslock.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    final UserService userservice;

    public UserController(UserService userService) {
        this.userservice = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userservice.getUsers());
    }
}
