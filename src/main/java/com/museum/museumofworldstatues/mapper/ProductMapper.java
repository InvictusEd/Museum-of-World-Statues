package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> selectAll();
//    查寻所有的轮播图信息
    List<Product> selectById();
  List<Product> selectById1();
  List<Product> selectById2();
  List<Product> selectById3();

}
