package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Introduce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IntroduceMapper {
    List<Introduce> selectAll();
//    查寻所有的轮播图信息
    List<Introduce> selectById();
    List<Introduce> selectById1();
    List<Introduce> selectById2();
    List<Introduce> selectById3();



}
