package com.museum.museumofworldstatues.entity;

import lombok.Data;

@Data
public class Comment {
    private Long id;
    private String imgUrl;//图片
    private String userName;//名称
    private String country;//国家
    private String author;//作者
    private String englishName;//英文名
}
