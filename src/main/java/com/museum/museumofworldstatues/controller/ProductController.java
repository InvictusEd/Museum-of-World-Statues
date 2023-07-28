package com.museum.museumofworldstatues.controller;

import com.museum.museumofworldstatues.entity.Product;
import com.museum.museumofworldstatues.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductMapper productMapper;
    @RequestMapping("/selectProduct")
    public List<Product> selectAll(){
        List<Product>products= productMapper.selectAll();
        return products;
    };

    @RequestMapping("/selectProductById")
    public List<Product> selectById(){
        List<Product> productDo=productMapper.selectById();
        return productDo;
    }
    @RequestMapping("/selectProductById1")
    public List<Product> selectById1(){
        List<Product> productDo1=productMapper.selectById1();
        return productDo1;
    }
    @RequestMapping("/selectProductById2")
    public List<Product> selectById2(){
        List<Product> productDo2=productMapper.selectById2();
        return productDo2;
    }
    @RequestMapping("/selectProductById3")
    public List<Product> selectById3(){
        List<Product> productDo3=productMapper.selectById3();
        return productDo3;
    }
}
