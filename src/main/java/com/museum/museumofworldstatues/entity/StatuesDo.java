package com.museum.museumofworldstatues.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description: 包括雕像国家和时代的雕像信息
 * @className: StatuesDo.java
 * @author: qqdas
 * @createTime: 2023/7/27 10:07
 */
@Data
public class StatuesDo {
    private Long id;
    private Long countryId;
    private Long periodId;
    private String countryName;
    private String periodName;
    private String coverImg;
    private String chineseName;
    private String foreignName;
    private String description;
    private String location;
    private Date constructionTime;
    private String creationBackground;
    private String afterlifeInfluence;
}
