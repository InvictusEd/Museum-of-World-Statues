package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Banner;
import com.museum.museumofworldstatues.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannerController {
    @Autowired
    BannerMapper bannerMapper;

    //查询分类1的轮播图
    @RequestMapping("/selectBannerFirst")
    public List<Banner> selectFirst(){
        List<Banner> banners = bannerMapper.selectFirst();
        return banners;
    }
    //查询分类2的轮播图
    @RequestMapping("/selectBannerSecond")
    public List<Banner> selectSecond(){
        List<Banner> banners = bannerMapper.selectSecond();
        return banners;
    }
    //查询分类3的轮播图
    @RequestMapping("/selectBannerThird")
    public List<Banner> selectThird(){
        List<Banner> banners = bannerMapper.selectThird();
        return banners;
    }

    //查询分类4的轮播图
    @RequestMapping("/selectBannerFourth")
    public List<Banner> selectFourth(){
        List<Banner> banners = bannerMapper.selectFourth();
        return banners;
    }

    //查询分类5的轮播图
    @RequestMapping("/selectBannerFifth")
    public List<Banner> selectFifth(){
        List<Banner> banners = bannerMapper.selectFifth();
        return banners;
    }

    //删除轮播图
    @RequestMapping("/removeBanner")
    public void deleteBanner(Long id){
        bannerMapper.deleteById(id);
    }

    //查询所有轮播图
    @RequestMapping("/selectBanner")
    public List<Banner> selectAll(){
        List<Banner> banners = bannerMapper.selectAll();
        return banners;
    }

    //添加轮播图
    @RequestMapping("/addBanner")
    public Integer addBanner(@RequestBody Banner banner){
        if (banner.getImgUrl() == null){
            return 1;
        } else {
            System.out.println(banner);
            bannerMapper.addBanner(banner);
        }
        return 0;
    }

    //根据id获取轮播图信息
    @RequestMapping("/BannerById")
    public List<Banner> selectById(Long id){
        List<Banner> banners = bannerMapper.selectById(id);
        return banners;
    }

    //修改轮播图信息
    @RequestMapping("/updateBanner")
    public void updateBanner(@RequestBody Banner banner){
        bannerMapper.updateBanner(banner);
    }
}
