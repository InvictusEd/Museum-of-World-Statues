package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.StatuesInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description: 雕像信息测试
 * @className: StatuesInfoMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/26 20:02
 */
@SpringBootTest
class StatuesInfoMapperTest {
    @Autowired
    StatuesInfoMapper mapper;
    @Test
    void selectAll() {
        List<StatuesInfo> statuesInfos = mapper.selectAll();
        statuesInfos.forEach(System.out::println);
    }

    @Test
    void selectByWd() {
        List<StatuesInfo> list = mapper.selectByWd("维纳斯");
        list.forEach(System.out::println);
    }
}