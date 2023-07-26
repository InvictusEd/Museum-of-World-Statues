package com.museum.museumofworldstatues.mapper;

import java.util.List;

public interface BannerMapper {
    //查询所有轮播图信息
    List<BannerMapper> selectAll();
    //根据轮播图id删除轮播图
    void deleteById(Long id);
}
