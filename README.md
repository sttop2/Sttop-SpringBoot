# Sttop-springboot
项目集成GITHUB

# 一.开发项目简介
  - 开发平台：windows
  - 开发工具：Intellij IDEA 2017.1
  - JDK：Java 8
  - Maven：maven-3.3.9
  - 服务器：tomcat 8.0
  - 数据库：MySQL 5.7
  - 数据源：Druid1.1.6
  - 缓存：Redis 3.2
  - 日志框架：SLF4J+Logback
  - Spring Boot：1.5.9.RELEASE
  - ORM框架：MyBatis+通用Mapper
  - Spring Boot官方文档：Spring Boot Reference Guide

# 项目配置
  1. banner设置：启动标头 http://patorjk.com/software/taag/
  2. application.properties 设置：https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#appendix
# 项目结构划分
  1. core 核心模块
   - base 是项目的基础核心，定义基础类，如：BaseController BaseService
   - cache 是缓存相关
   - constans 是定义系统的常量
   - exception 是定义系统的常量
   - system 是系统模块
   - utils 是通用工具类
