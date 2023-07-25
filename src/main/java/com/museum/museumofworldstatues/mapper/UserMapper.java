package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //添加用户
    void addUser(User user);
    //根据用户名查询用户信息
    User selectByName(String userName);

}
