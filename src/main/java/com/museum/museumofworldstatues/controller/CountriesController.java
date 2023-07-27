package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Countries;
import com.museum.museumofworldstatues.mapper.CountriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
