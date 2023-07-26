package com.museum.museumofworldstatues.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@RestController
public class OSSConttroller {
    @RequestMapping("/upload")
    public String uploadFile(MultipartFile file) throws IOException {
        //1、获取工具类中的值
        String endpoint ="oss-cn-beijing.aliyuncs.com";
        String accessKeyId ="LTAI5tMqzUeDg811xbV8Tgzr";
        String accessKeySecret ="Dlhi9wfz5kBGtTcfnPA1eNEkABFklb";
        String bucketName ="aurora4486";
        try {
            //2、创建oss实例
            OSS ossClient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
            //3、获取上传文件输入流
            InputStream inputStream = file.getInputStream();
            //4、获取文件名称
            String filename = file.getOriginalFilename();
            filename = UUID.randomUUID().toString()+filename;
            //5、调用oss实现上传
            ossClient.putObject(bucketName,filename,inputStream);
            //6、关闭
            ossClient.shutdown();
            //文件路径：http://education-online-5.oss-cn-beijing.aliyuncs.com/image01.jpg
            String url = "http://"+bucketName+"."+endpoint+"/"+filename;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
