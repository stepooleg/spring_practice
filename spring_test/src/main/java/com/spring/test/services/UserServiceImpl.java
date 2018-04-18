package com.spring.test.services;

import com.spring.test.dao.UserDao;
import com.spring.test.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public List<Users> getUser() {
        return userDao.getUsers();
    }
}
