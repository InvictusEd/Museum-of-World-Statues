package com.museum.museumofworldstatues.mapper;

import java.util.List;

public interface HomePageBannerMapper {
    //查询所有轮播图信息
    List<HomePageBannerMapper> selectAll();
    //根据轮播图id删除轮播图
    void deleteById(Long id);
}
