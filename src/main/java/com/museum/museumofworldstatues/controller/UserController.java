package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.User;
import com.museum.museumofworldstatues.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

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

    /*登录*/
    @RequestMapping("login")
    public Integer login(String userName, String password, HttpSession session){
        //1、判断用户是否存在
        User user = userMapper.selectByName(userName);
        if(user == null){
            return 0;//用户不存在
        }
        //2、判断密码是否正确
        if (!user.getPassword().equals(password)){
            return 1;//密码错误
        }

        //将user保存到u里面
        session.setAttribute("u",user);
        //登录成功普通用户和管理员，普通用户进入前台首页，管理员进入后台首页
        if (user.getIsAdmin()==0) {
            return 2;//普通用户
        }
        return 3;//管理员
    }

}
