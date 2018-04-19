package com.spring.dao;

import com.spring.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao implements Dao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<UserModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM users", new RowMapper<UserModel>() {
            @Override
            public UserModel mapRow(ResultSet resultSet, int i) throws SQLException {
                return new UserModel(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"));
            }
        });

    }
}
