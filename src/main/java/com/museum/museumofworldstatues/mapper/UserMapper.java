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
    //查询所有用户信息
    List<User> selectAll();
    //根据用户id删除用户信息
    void deleteById(Long id);
    //修改管理员权限
    void changeAdmin(Integer flag, Long id);

    /*修改用户信息*/
    void updateUser(User user);

}
