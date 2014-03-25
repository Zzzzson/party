package com.springapp.service;

import com.springapp.domain.Function;
import com.springapp.domain.User;
import com.springapp.persistence.FunctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by plus on 14-3-24.
 */
@Service
public class FunctionService {

    @Autowired
    private FunctionMapper functionMapper;

    public List<Function> getAll(){
        return functionMapper.getAll();
    }
    public void createFunction(Function function){
        functionMapper.insertFunction(function);
    }

    public void join(User user,int id){
        Function function = functionMapper.getFunction(id);
        function.getUsers().add(user);
        functionMapper.update(function);
    }

}
