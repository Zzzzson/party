package com.springapp.service;

import com.springapp.domain.Function;
import com.springapp.domain.User;
import com.springapp.persistence.FunctionMapper;
import com.springapp.persistence.UserMapper;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by plus on 14-3-24.
 */
@Service
public class FunctionService {

    @Autowired
    private FunctionMapper functionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<Function> getAll(){
        return functionMapper.getAll();
    }
    public void createFunction(Function function){
        functionMapper.insertFunction(function);
    }

    public Function getFunction(int id){
        return functionMapper.getFunctionAndUser(id);
    }
    public void join(User user,int id){
        Map<String,Object> uaf = new HashMap<String,Object>();
        uaf.put("userId",user.getUserId());
        uaf.put("functionId",id);
        if(functionMapper.existUserInFunction(uaf) <= 0){
            functionMapper.addUserToFunction(uaf);
        }
    }

}
