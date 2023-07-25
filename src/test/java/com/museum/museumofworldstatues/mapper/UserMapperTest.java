package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description: 用户表数据库测试
 * @className: UserMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/24 10:44
 */
@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    void selectAll() {
        List<User> users = mapper.selectAll();
        users.forEach(System.out::println);
    }
}