package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Periods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @className: Periods.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:42
 */
@Mapper
public interface PeriodsMapper {
    //查询所有雕像时代信息
    List<Periods> selectAll();
}
