# Museum-of-World-Statues
世界雕像博物馆网站

## 开发版本 1.0
### 遇到的问题
>Spring Boot 的启动问题：不支持发行版本

解决方案：  
更改pom文件：降低Spring Boot版本为2.7.13。  
该问题已得到解决。

### 后续clone和pull代码时还可能继续出现不支持发行版本
解决方案：删除`<build></build>`标签内的新增的内容，以此降低依赖JDK版本
```
<plugin>
    ...
    <version>16</version>
    ...
</plugin>
```
对照该项目原本的pom文件，把这些部分删除即可。  
>需要注意的：启动Spring Boot需要连接本地数据库。
> 在application.properties文件中自行进行配置
