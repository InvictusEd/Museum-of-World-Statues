package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerMapper {
    //查询第一分类轮播图信息
    List<Banner> selectFirst();
    //查询第二分类轮播图信息
    List<Banner> selectSecond();
    //查询第三分类轮播图信息
    List<Banner> selectThird();
    //查询第四分类轮播图信息
    List<Banner> selectFourth();
    //查询所有轮播图信息
    List<Banner> selectAll();
    //根据轮播图id删除轮播图
    void deleteById(Long id);
    //添加轮播图
    void addBanner(Banner banner);
}
