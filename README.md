# SpringBoot2Dubbo
SpringBoot整合Dubbo实现RPC服务提供、服务消费Demo，以及logback配置

1.dubbo集成依赖
<dependency>
	<groupId>com.alibaba.boot</groupId>
	<artifactId>dubbo-spring-boot-starter</artifactId>
</dependency>
<dependency>
	<groupId>org.apache.zookeeper</groupId>
	<artifactId>zookeeper</artifactId>
</dependency>
<dependency>
	<groupId>org.apache.curator</groupId>
	<artifactId>curator-framework</artifactId>
</dependency>

2.同构项目，dubbo的@Service并指定版本

3.启动类中增加@EnableDubbo

4.消费服务@Reference并指定版本

5.zookeeper安装、启动

6.dubbo可视化管理界面，下载dubbo-admin-2.6.0版本，高版本支持不友好
下载地址:https://github.com/apache/dubbo/releases/tag/dubbo-2.6.0
http://127.0.0.1:8080/dubbo-admin-2.6.0

7.https方式访问，申请证书（使用域名申请正式证书），yml配置
server:
  ssl:
    key-store: classpath:keystore.p12
    key-alias: tomcat
    enabled: true
    key-store-password: 456789
    key-store-type: PKCS12
