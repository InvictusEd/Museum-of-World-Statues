package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.StatuesInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 雕像信息持久层
 * @className: StatuesInfoMapper.java
 * @author: qqdas
 * @createTime: 2023/7/26 19:54
 */
@Mapper
public interface StatuesInfoMapper {
    //查询所有雕像的信息
    List<StatuesInfo> selectAll();
}
