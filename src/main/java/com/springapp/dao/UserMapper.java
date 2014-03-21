package com.springapp.dao;

import com.springapp.domain.User;

/**
 * Created by plus on 14-3-21.
 */
public interface UserMapper {
    User getUser(int id);

    void insertUser(User user);
}
