package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.ContentDo;
import com.museum.museumofworldstatues.entity.User;
import com.museum.museumofworldstatues.mapper.ContentMapper;
import com.museum.museumofworldstatues.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ContentController {

    @Autowired
    ContentMapper contentMapper;

    //根据id查询详情信息
    @RequestMapping("/selectById")
    public ContentDo selectContentDetail(Integer id){
        ContentDo contentDo = contentMapper.selectById(id);
        return contentDo;
    }

}
