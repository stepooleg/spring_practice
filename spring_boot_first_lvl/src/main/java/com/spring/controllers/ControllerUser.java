package com.spring.controllers;

import com.spring.dao.UserDao;
import com.spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerUser {
@Autowired
UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
