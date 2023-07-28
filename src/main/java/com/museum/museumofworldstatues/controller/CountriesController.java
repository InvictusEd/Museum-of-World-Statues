package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Countries;
import com.museum.museumofworldstatues.entity.User;
import com.museum.museumofworldstatues.mapper.CountriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @className: CountriesController.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:34
 */
@RestController
public class CountriesController {
    @Autowired
    CountriesMapper countriesMapper;

    /**
     * @description: 查询所有雕像国家的信息
     * @param
     * @return: java.util.List<com.museum.museumofworldstatues.entity.Countries>
     * @author: qqdas
     * @time: 2023/7/27 9:35
     */
    @RequestMapping("/selectCountries")
    public List<Countries> selectAll(){
        List<Countries> countries = countriesMapper.selectAll();
        return countries;
    }

    //添加国家
    @RequestMapping("/addCountry")
    public Integer addCountry(@RequestBody Countries countries){
//        1、根据国家名判断国家是否存在，如果已存在直接返回“该国家已存在”
        System.out.println("前端接收到的对象为："+countries);
        Countries countries1 = countriesMapper.selectByName(countries.getName());
        if(countries1!=null){
            return 1;//国家已存在
        }else{
            countriesMapper.addCountry(countries);
        }
//        2、将国家信息添加至数据库，并返回“添加成功”
        return 0;//添加成功
    }

    //删除国家
    @RequestMapping("/removeCountry")
    public void deleteCountry(Long id){
        countriesMapper.deleteCountry(id);
    }
}
