package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Banner;
import com.museum.museumofworldstatues.entity.StatuesImages;
import com.museum.museumofworldstatues.mapper.StatuesImagesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @className: StatuesImagesController.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:15
 */
@RestController
public class StatuesImagesController {
    @Autowired
    StatuesImagesMapper statuesImagesMapper;

    /**
     * @description: 查询所有雕像图片信息
     * @param
     * @return: java.util.List<com.museum.museumofworldstatues.entity.StatuesImages>
     * @author: qqdas
     * @time: 2023/7/27 9:18
     */
    @RequestMapping("/selectStatuesImages")
    public List<StatuesImages> selectAll(){
        List<StatuesImages> statuesImages = statuesImagesMapper.selectAll();
        return statuesImages;
    }

    //添加雕像图
    @RequestMapping("/addStatuesImages")
    public Integer addStatuesImages(@RequestBody StatuesImages statuesImages){
        if (statuesImages.getImgUrl() == null){
            return 1;
        } else {
            System.out.println(statuesImages);
            statuesImagesMapper.addStatuesImages(statuesImages);
        }
        return 0;
    }

    //根据id删除雕像图
    @RequestMapping("/removeStatuesImages")
    public void deleteStatuesImages(Long id){
        statuesImagesMapper.deleteById(id);
    }

}
