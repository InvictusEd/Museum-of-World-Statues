package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Content;
import com.museum.museumofworldstatues.entity.ContentDo;
import com.museum.museumofworldstatues.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContentMapper {
    //根据图片查询详情信息
    ContentDo selectById(Integer id);
}
