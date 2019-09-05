package com.yuntian.spring.dao;

import com.yuntian.spring.mode.User;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther: yuntian
 * @Date: 2019/9/2 0002 23:36
 * @Description:
 */
public class UserMapper implements RowMapper<User> {




    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user=new User();
        user.setId(rs.getLong("id"));
        user.setAge(rs.getInt("age"));
        user.setUserName(rs.getString("user_name"));
        user.setEmail( rs.getString("email"));
        return user;
    }




}
