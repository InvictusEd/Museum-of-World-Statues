package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Introduce;
import com.museum.museumofworldstatues.mapper.IntroduceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IntroduceController {
    @Autowired
    IntroduceMapper introduceMapper;
    @RequestMapping("/selectIntroduce")
    public List<Introduce> selectAll(){
        List<Introduce>introduces= introduceMapper.selectAll();
        return introduces;
    };

    @RequestMapping("/selectIntroduceById")
    public List<Introduce> selectById(){
        List<Introduce> introduceDo=introduceMapper.selectById();
        return introduceDo;
    }
    @RequestMapping("/selectIntroduceById1")
    public List<Introduce> selectById1(){
        List<Introduce> introduceDo1=introduceMapper.selectById1();
        return introduceDo1;
    }
    @RequestMapping("/selectIntroduceById2")
    public List<Introduce> selectById2(){
        List<Introduce> introduceDo1=introduceMapper.selectById2();
        return introduceDo1;
    }
    @RequestMapping("/selectIntroduceById3")
    public List<Introduce> selectById3(){
        List<Introduce> introduceDo1=introduceMapper.selectById3();
        return introduceDo1;
    }
}
