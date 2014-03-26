package com.springapp.domain;

import java.io.Serializable;

/**
 * Created by plus on 14-3-18.
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer  userId;

    private String name;

    private String email;

    private String password;
    // 0 is girls,1 is boys;
    private int sex;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
