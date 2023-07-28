package com.museum.museumofworldstatues.mapper;

import com.museum.museumofworldstatues.entity.Countries;
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
    //根据id删除时期
    void deletePeriod(Long id);
    //添加时期
    void addPeriod(Periods periods);
    //根据时期名查询时期信息
    Periods selectByName(String name);
}
