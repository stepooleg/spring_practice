package com.spring.controllers;

import com.spring.servises.Serv;
import com.spring.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    Serv userController;

    @RequestMapping
    public List<UserModel> setUser() {
        return userController.findAll();
    }
}
