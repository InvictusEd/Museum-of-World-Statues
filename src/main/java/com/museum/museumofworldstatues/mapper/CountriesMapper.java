package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Countries;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @className: CountriesMapper.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:28
 */
@Mapper
public interface CountriesMapper {
    //查询所有雕像国家的信息
    List<Countries> selectAll();
}
