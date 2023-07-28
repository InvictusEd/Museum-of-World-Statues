package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Countries;
import com.museum.museumofworldstatues.entity.User;
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
    //根据id删除国家
    void deleteCountry(Long id);
    //添加国家
    void addCountry(Countries countries);
    //根据国家名查询国家信息
    Countries selectByName(String name);
}
