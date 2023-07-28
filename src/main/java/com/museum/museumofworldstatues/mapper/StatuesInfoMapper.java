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

    //根据id删除雕像信息
    void deleteStatuesInfo(Long id);
    //添加雕像信息
    void addStatuesInfo(StatuesInfo statuesInfo);
    //模糊查询
    List<StatuesInfo> selectByWd(String wd);
}
