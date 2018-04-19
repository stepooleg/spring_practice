package com.spring.servises;

import com.spring.dao.Dao;
import com.spring.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServise implements Serv {
    @Autowired
    Dao userDao;

    public List<UserModel> findAll() {
        return userDao.findAll();
    }
}
