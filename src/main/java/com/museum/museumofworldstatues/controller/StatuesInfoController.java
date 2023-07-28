package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.StatuesImages;
import com.museum.museumofworldstatues.entity.StatuesInfo;
import com.museum.museumofworldstatues.mapper.StatuesInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 雕像信息控制层
 * @className: StatuesController.java
 * @author: qqdas
 * @createTime: 2023/7/26 20:19
 */
@RestController
public class StatuesInfoController {
    @Autowired
    StatuesInfoMapper statuesInfoMapper;

    @RequestMapping("/selectStatuesInfo")
    public List<StatuesInfo> selectAll(){
        List<StatuesInfo> statuesInfos = statuesInfoMapper.selectAll();
        return statuesInfos;
    }

    //根据id删除雕像信息
    @RequestMapping("/removeStatuesInfo")
    public void deleteStatuesInfo(Long id){
        statuesInfoMapper.deleteStatuesInfo(id);
    }

    //添加雕像信息
    @RequestMapping("/addStatuesInfo")
    public Integer addStatuesInfo(@RequestBody StatuesInfo statuesInfo ){
        System.out.println(statuesInfo);
        statuesInfoMapper.addStatuesInfo(statuesInfo);
        return 0;
    }
}
