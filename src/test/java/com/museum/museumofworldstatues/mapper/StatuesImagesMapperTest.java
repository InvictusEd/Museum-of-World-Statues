package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.StatuesImages;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @className: StatuesImagesMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:13
 */
@SpringBootTest
class StatuesImagesMapperTest {
    @Autowired
    StatuesImagesMapper statuesImagesMapper;

    @Test
    void selectAll() {
        List<StatuesImages> statuesImages = statuesImagesMapper.selectAll();
        statuesImages.forEach(System.out::println);
    }
}