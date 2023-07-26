package com.museum.museumofworldstatues.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String userName;
    private String password;
    private String nickName;
    private String email;
    private String birthday;
    private Integer isAdmin;
    private String imgUrl;
    private Date createTime;
}
