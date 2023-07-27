package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Periods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @className: PeriodsMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:46
 */
@SpringBootTest
class PeriodsMapperTest {
    @Autowired
    PeriodsMapper periodsMapper;

    @Test
    void selectAll() {
        List<Periods> periods = periodsMapper.selectAll();
        periods.forEach(System.out::println);
    }
}