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
        System.out.println("前端接收到的对象为："+user);
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

    /**
     * @description: 查询所有用户信息
     * @param
     * @return: java.util.List<com.museum.museumofworldstatues.entity.User>
     * @author: qqdas
     * @time: 2023/7/24 9:32
     */
    @RequestMapping("/selectUserList")
    public List<User> selectAll(){
        List<User> users = userMapper.selectAll();
        return users;
    }

    /**
     * @description: 获取当前登录对象
     * @param session
     * @return: com.museum.museumofworldstatues.entity.User
     * @author: qqdas
     * @time: 2023/7/25 8:59
     */
    @RequestMapping("/currentUser")
    public User getUser(HttpSession session){
        User u = (User)session.getAttribute("u");
        return u;
    }

    /**
     * @description: 退出登录，清楚对象
     * @param session
     * @return: void
     * @author: qqdas
     * @time: 2023/7/25 14:21
     */
    @RequestMapping("/logout")
    public void logout(HttpSession session){
        session.removeAttribute("u");
    }

    /*删除用户信息*/
    @RequestMapping("/removeUser")
    public void deleteUser(Long id){
        userMapper.deleteById(id);
    }

    /*修改用户身份*/
    @RequestMapping("/changeUser")
    public void change(@RequestBody User user){

        Integer flag = 0;
        //如果已经是普通用户，则修改为1（管理员）
        if (user.getIsAdmin()==0){
            flag = 1;
        }
        //根据id修改isAdmin
        userMapper.changeAdmin(flag,user.getId());
    }

    /*修改用户信息*/
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        userMapper.updateUser(user);
    }

    /*用户忘记密码，自行修改用户密码*/
    @RequestMapping("/updateUserPassword")
    public Integer updateUserPassword(@RequestBody User user){
        System.out.println(user);
//        1.根据用户名判断用户是否存在，如果不存在返回“用户不存在”
        User user1 = userMapper.selectByName(user.getUserName());
        if (user1 == null){
            //用户不存在
            return 0;
        }else {
            userMapper.updateUserPassword(user);
        }
//        2、将用户的密码修改，并返回“修改成功”
        return 1;
    }

}
