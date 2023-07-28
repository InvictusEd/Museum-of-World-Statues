package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Countries;
import com.museum.museumofworldstatues.entity.Periods;
import com.museum.museumofworldstatues.mapper.PeriodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    //添加时期
    @RequestMapping("/addPeriod")
    public Integer addPeriod(@RequestBody Periods periods){
//        1、根据时期名判断国家是否存在，如果已存在直接返回“该时期已存在”
        System.out.println("前端接收到的对象为："+periods);
        Periods periods1 = periodsMapper.selectByName(periods.getName());
        if(periods1!=null){
            return 1;//国家已存在
        }else{
            periodsMapper.addPeriod(periods);
        }
//        2、将国家信息添加至数据库，并返回“添加成功”
        return 0;//添加成功
    }

    //删除时期
    @RequestMapping("/removePeriod")
    public void deletePeriod(Long id){
        periodsMapper.deletePeriod(id);
    }
}
