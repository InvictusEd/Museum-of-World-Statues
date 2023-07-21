package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.User;
import com.museum.museumofworldstatues.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/addUser")
    public Integer addUser(@RequestBody User user){
//        1、根据用户名判断用户是否存在，如果已存在直接返回“该用户已存在”
//        System.out.println("前端接收到的对象为："+user);
        User user1 = userMapper.selectByName(user.getUserName());
        if(user1!=null){
            return 1;//用户已存在
        }else{
            userMapper.addUser(user);
        }
//        2、将用户信息添加至数据库，并返回“注册成功”
        return 0;//注册成功
    }
}
