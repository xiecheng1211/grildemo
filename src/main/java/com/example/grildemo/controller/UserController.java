package com.example.grildemo.controller;

import com.example.grildemo.entity.User;
import com.example.grildemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id){
        return userService.Sel(id);
    }
}
