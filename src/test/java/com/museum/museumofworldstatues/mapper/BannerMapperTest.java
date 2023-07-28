package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Banner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description: 轮播图测试
 * @className: BannerMapperTest.java
 * @author: qqdas
 * @createTime: 2023/7/26 18:46
 */
@SpringBootTest
class BannerMapperTest {
    @Autowired
    BannerMapper mapper;
    @Test
    void selectFirst() {
        List<Banner> banners = mapper.selectFirst();
        banners.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Banner> banners = mapper.selectAll();
        banners.forEach(System.out::println);
    }

    @Test
    void selectSecond() {
        List<Banner> banners = mapper.selectSecond();
        banners.forEach(System.out::println);
    }

    @Test
    void selectThird() {
        List<Banner> banners = mapper.selectThird();
        banners.forEach(System.out::println);
    }

    @Test
    void selectById() {
        List<Banner> banners = mapper.selectById(1L);
        banners.forEach(System.out::println);
    }

    @Test
    void selectFifth() {
        List<Banner> banners = mapper.selectFifth();
        banners.forEach(System.out::println);
    }
}