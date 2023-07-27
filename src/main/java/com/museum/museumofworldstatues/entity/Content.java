package com.museum.museumofworldstatues.entity;

import lombok.Data;

@Data
public class Content {
    private Long id;
    private String imgUrl;//图片
    private String chineseName;//中文名
    private String countries;//国家
    private String author;//作者
    private String englishName;//英文名
}
