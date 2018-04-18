package com.spring.test.dao;

import com.spring.test.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Users> getUsers(){
        return jdbcTemplate.query
                ("SELECT * FROM users",
                        new RowMapper<Users>() {
                            @Override
                            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
                                return new Users(resultSet.getInt("ID"),resultSet.getString("Name"));
                            }
                        });

    }
}
