package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Countries;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @className: CountriesMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:32
 */
@SpringBootTest
class CountriesMapperTest {
    @Autowired
    CountriesMapper countriesMapper;

    @Test
    void selectAll() {
        List<Countries> countries = countriesMapper.selectAll();
        countries.forEach(System.out::println);
    }
}