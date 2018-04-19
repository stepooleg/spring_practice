package com.spring.dao;

import com.spring.models.UserModel;

import java.util.List;

public interface Dao {
    public List<UserModel> findAll();
}
