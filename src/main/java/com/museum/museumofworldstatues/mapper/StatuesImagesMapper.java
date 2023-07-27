package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.StatuesImages;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @className: StatuesImagesMapper.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:06
 */
@Mapper
public interface StatuesImagesMapper {
    //查询所有雕像图片
    List<StatuesImages> selectAll();
}
