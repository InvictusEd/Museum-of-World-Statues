package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.ContentDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ContentMapperTest {
    @Autowired
    ContentMapper mapper;

    @Test
    void selectById() {
        ContentDo contentDo = mapper.selectById(2);
        System.out.println(contentDo);
    }
}