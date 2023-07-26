package com.museum.museumofworldstatues.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description: 雕像信息实体类
 * @className: StatuesInfo.java
 * @author: qqdas
 * @createTime: 2023/7/26 19:42
 */
@Data
public class StatuesInfo {
    private Long id;
    private Long countryId;
    private Long periodId;
    private String coverImg;
    private String chineseName;
    private String foreignName;
    private String description;
    private String location;
    private Date constructionTime;
    private String creationBackground;
    private String afterlifeInfluence;
}
