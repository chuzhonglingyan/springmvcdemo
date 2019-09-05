package com.yuntian.spring.repository;


import com.yuntian.spring.dao.UserMapper;
import com.yuntian.spring.mode.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public class UserRepository {


    @Autowired
    private JdbcOperations jdbc;

    public User getUser(Integer id) {
        return jdbc.queryForObject("select id, user_name,age,email from user where id=?", new UserMapper(), id);
    }


}
