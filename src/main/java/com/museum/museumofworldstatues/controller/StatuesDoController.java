package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.StatuesDo;
import com.museum.museumofworldstatues.entity.StatuesInfo;
import com.museum.museumofworldstatues.mapper.StatuesDoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @className: StatuesDoController.java
 * @author: qqdas
 * @createTime: 2023/7/27 10:34
 */
@RestController
public class StatuesDoController {
    @Autowired
    StatuesDoMapper statuesDoMapper;

    @RequestMapping("/selectStatuesDo")
    public List<StatuesDo> selectAll(){
        List<StatuesDo> statuesDos = statuesDoMapper.selectAll();
        return statuesDos;
    }

    //根据关键字搜索信息
    @RequestMapping("/selectByWd")
    public List<StatuesDo> selectByWd(String wd){
        List<StatuesDo> contents = statuesDoMapper.selectByWd(wd);
        return contents;
    }

    //根据id查询详情信息
    @RequestMapping("/selectById")
    public StatuesDo selectById(Integer id){
        StatuesDo statuesDo = statuesDoMapper.selectById(id);
        return statuesDo;
    }
}
