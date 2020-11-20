# This file is for notes when studying Spring
## Xml files in pom.xml

```
<<?xml version="1.0" encoding="UTF-8"?>
 <project xmlns="http://maven.apache.org/POM/4.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
     <modelVersion>4.0.0</modelVersion>
 
     <groupId>com.wzq.spring1</groupId>
     <artifactId>Spring1</artifactId>
     <packaging>pom</packaging>
     <version>1.0-SNAPSHOT</version>
     <modules>
         <module>Spring-ioc1</module>
         <module>HelloWorld</module>
         <module>Spring-autowired</module>
         <module>Annotation</module>
         <module>Spring-Proxy</module>
         <module>MyBatis</module>
     </modules>
 
     <dependencies>
         <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
         <dependency>
             <groupId>org.springframework</groupId>
             <artifactId>spring-webmvc</artifactId>
             <version>5.3.1</version>
         </dependency>
         <dependency>
             <groupId>junit</groupId>
             <artifactId>junit</artifactId>
             <version>4.12</version>
         </dependency>
         <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
         <dependency>
             <groupId>org.aspectj</groupId>
             <artifactId>aspectjweaver</artifactId>
             <version>1.9.4</version>
             <scope>runtime</scope>
         </dependency>
         <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
         <dependency>
             <groupId>org.mybatis</groupId>
             <artifactId>mybatis</artifactId>
             <version>3.4.5</version>
         </dependency>
 
 
 
 
     </dependencies>
 </project>
```

## MySQL:
```
create database MyBatis;
use MyBatis;
CREATE TABLE `user`(
    `id` int(11) NOT NULL auto_increment,
    `username` varchar(32) NOT NULL COMMENT '用户名称',
    `birthday` datetime default NULL COMMENT '生日',
    `sex` char(1) default NULL COMMENT '性别',
    `address` varchar(256) default NULL COMMENT '地址',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES (41,'老王','2018-02-27 17:47:08', '男','北京'),
                          (42,'小二王','2019-02-27 17:47:08', '女','北京金燕龙'),
                          (43,'小二王','2017-02-27 17:47:08', '女','北京金燕龙'),
                          (44,'传智博客','2016-02-27 17:47:08', '男','北京金燕龙');
```