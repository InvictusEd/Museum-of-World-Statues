package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.StatuesDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @className: StatuesDoMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/27 10:32
 */
@SpringBootTest
class StatuesDoMapperTest {
    @Autowired
    StatuesDoMapper statuesDoMapper;

    @Test
    void selectAll() {
        List<StatuesDo> statuesDos = statuesDoMapper.selectAll();
        statuesDos.forEach(System.out::println);
    }
}