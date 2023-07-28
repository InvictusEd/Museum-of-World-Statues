package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.StatuesDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @className: StatuesDoMapper.java
 * @author: qqdas
 * @createTime: 2023/7/27 10:12
 */
@Mapper
public interface StatuesDoMapper {
    List<StatuesDo> selectAll();
}