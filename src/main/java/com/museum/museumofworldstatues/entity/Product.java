package com.museum.museumofworldstatues.entity;

import lombok.Data;

@Data
public class Product {
   private Integer id;
   private String name;
   private Integer price;
   private Integer typeId;
   private String  imgUrl;
   private String  intPUrl;
   private String  intUrl;
}
