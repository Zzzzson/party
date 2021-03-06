package com.springapp.domain;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;

/**
 * Created by plus on 14-3-21.
 */
public class Function implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer functionId;

    private String tittle;

    private String introduction;

    private String address;

    private String type;

    private Timestamp deadline;

    private Timestamp startTime;

    private List<User> users;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
}
