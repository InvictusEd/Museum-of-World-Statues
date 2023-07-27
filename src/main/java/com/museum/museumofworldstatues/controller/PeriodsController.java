package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Periods;
import com.museum.museumofworldstatues.mapper.PeriodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @className: PeriodsController.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:53
 */
@RestController
public class PeriodsController {
    @Autowired
    PeriodsMapper periodsMapper;

    @RequestMapping("/selectPeriods")
    public List<Periods> selectAll(){
        List<Periods> periods = periodsMapper.selectAll();
        return periods;
    }
}
