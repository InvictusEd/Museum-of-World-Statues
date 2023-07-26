package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BannerMapper {
    //查询所有轮播图信息
    List<Banner> selectAll();
    //根据轮播图id删除轮播图
    void deleteById(Long id);
}
