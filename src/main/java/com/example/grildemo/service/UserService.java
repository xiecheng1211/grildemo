package com.example.grildemo.service;

import com.example.grildemo.entity.User;
import com.example.grildemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }

}
