package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Banner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BannerMapperTest {
    @Autowired
    BannerMapper mapper;
    @Test
    void selectFirst() {
        List<Banner> banners = mapper.selectFirst();
        banners.forEach(System.out::println);
    }
}