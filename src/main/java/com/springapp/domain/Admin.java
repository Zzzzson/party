package com.springapp.domain;

import java.io.Serializable;

/**
 * Created by plus on 14-3-21.
 */
public class Admin implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    private int authority;

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

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}
