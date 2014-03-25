package com.springapp.service;

import com.springapp.domain.User;
import com.springapp.persistence.UserMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by plus on 14-3-24.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String name){
        return userMapper.getUser(name);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }

}
