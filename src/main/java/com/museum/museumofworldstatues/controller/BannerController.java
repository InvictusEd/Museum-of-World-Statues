package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Banner;
import com.museum.museumofworldstatues.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannerController {
    @Autowired
    BannerMapper bannerMapper;

    @RequestMapping("/selectBannerFirst")
    public List<Banner> selectFirst(){
        List<Banner> banners = bannerMapper.selectFirst();
        return banners;
    }

    //删除轮播图
    @RequestMapping("/removeBanner")
    public void deleteBanner(Long id){
        bannerMapper.deleteById(id);
    }

}
