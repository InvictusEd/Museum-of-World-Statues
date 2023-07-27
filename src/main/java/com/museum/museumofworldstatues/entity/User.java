package com.museum.museumofworldstatues.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {
    private Long id;//id
    private String userName;//用户名
    private String password;//密码
    private String nickName;//昵称
    private String email;//邮箱地址
    private String birthday;//生日
    private Integer isAdmin;//是否为管理员 0 1
    private String imgUrl;//头像
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;//创建时间
}
