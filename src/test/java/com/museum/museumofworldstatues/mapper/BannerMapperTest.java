package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Banner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @className: BannerMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/26 18:46
 */
@SpringBootTest
class BannerMapperTest {
    @Autowired
    BannerMapper mapper;

    @Test
    void selectAll() {
        List<Banner> banners = mapper.selectAll();
        banners.forEach(System.out::println);
    }

}