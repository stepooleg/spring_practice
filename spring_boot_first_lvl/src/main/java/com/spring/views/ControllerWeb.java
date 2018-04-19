package com.spring.views;

import com.spring.controllers.ControllerUser;
import com.spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControllerWeb {
    @Autowired
    ControllerUser controllerUser;

    @RequestMapping("/")
    public List<User> setUser(){
        return controllerUser.findAll();
    }
}
