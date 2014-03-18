package com.springapp.domain;

import java.io.Serializable;

/**
 * Created by plus on 14-3-18.
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer  id;

    private String name;

    private String password;
    // 0 is girls,1 is boys;
    private int sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
