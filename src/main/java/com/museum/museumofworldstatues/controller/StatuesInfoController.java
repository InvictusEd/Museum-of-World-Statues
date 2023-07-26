package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.StatuesInfo;
import com.museum.museumofworldstatues.mapper.StatuesInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
}
