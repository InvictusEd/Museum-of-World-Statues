package com.museum.museumofworldstatues.entity;

import lombok.Data;

/**
 * @description:
 * @className: StatuesImages.java
 * @author: qqdas
 * @createTime: 2023/7/27 9:05
 */
@Data
public class StatuesImages {
    private Long id;
    private Long statueId;
    private String imgUrl;
    private String chineseName;
}
