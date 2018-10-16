# 《Spring微服务实战》的实战

## 技能树
### 架构风格
- RESTful

### 开发技术
- Spring
- Spring Boot
- Spring Cloud
- Mybatis
- druid数据库连接池
- Mysql
- Redis
- [elasticsearch](https://www.elastic.co/cn/products/elasticsearch)
- [ELK日志系统](https://blog.csdn.net/wyyl1/article/details/80517727)

### 测试相关
- [TestNG](https://testng.org/doc/index.html)
- MockMvc
- FindBugs插件

### 相关概念
- 微服务
- 通过注册中心实现服务发现与注册
- RPC（Remote Procedure Call）远程过程调用协议
- 无状态请求
- 分布式事物
- [Swagger](https://swagger.io/)（Api文档工具）
- Markdown（文档格式）

## 参考资料

- [Mybatis](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
- [Mybatis中文](http://www.mybatis.org/mybatis-3/zh/index.html)
- [spring boot + mybatis + druid](https://www.cnblogs.com/waterlufei/p/7056420.html)
- [Druid](https://github.com/alibaba/druid)
- [如何在Spring Boot中集成Druid连接池和监控？](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter)
- [Druid Spring Boot Starter](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter)
- [MyBatis工具 分页插件 PageHelper、通用 Mapper](http://mybatis.tk)
- [Spring Boot 集成 MyBatis, 分页插件 PageHelper, 通用 Mapper](https://github.com/abel533/MyBatis-Spring-Boot)
- [zipkin](https://zipkin.io)
- [zipkin-server启动说明](https://github.com/openzipkin/zipkin/tree/master/zipkin-server)
- [spring boot 开发时热部署](https://blog.csdn.net/xusheng_Mr/article/details/78771746)
- [Spring Validating Form Input](https://spring.io/guides/gs/validating-form-input/)
- 结合这2个学习 [Swagger从入门到精通](https://huangwenchao.gitbooks.io/swagger/content/) [Swagger编辑器](https://editor.swagger.io/)
- [一篇文章带你搞懂 SpringBoot与Swagger整合](https://blog.csdn.net/itguangit/article/details/78978296)
- [如何优化Mysql千万级快速分页](https://blog.csdn.net/qq_36276335/article/details/73824243)
- [分页类方法取名参考Mysql文档](https://dev.mysql.com/doc/refman/8.0/en/select.html)
- [fastmybatis](https://blog.csdn.net/thc1987/article/details/80747352)
- [如何对 JPA 或者 MyBatis 进行技术选型](http://www.spring4all.com/article/391)
- [spring return http status code](https://stackoverflow.com/questions/16232833/how-to-respond-with-http-400-error-in-a-spring-mvc-responsebody-method-returnin)
- [Spring官网 Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [知乎 关于 RESTful API 中 HTTP 状态码的定义的疑问？](https://www.zhihu.com/question/58686782)
- [RESTful API 设计指南](http://www.ruanyifeng.com/blog/2014/05/restful_api.html)
- [IBM REST API 约定](https://www.ibm.com/support/knowledgecenter/zh/SS4GCC_6.1.1/com.ibm.urelease.doc/topics/rest_api_ref_conventions.html)
- [Spring官网 Testing the Web Layer](https://spring.io/guides/gs/testing-web/)
- [Spring官网 Spring Data REST Reference Documentation](https://docs.spring.io/spring-data/rest/docs/2.0.0.M1/reference/html/index.html)

### MockMvc
- [MockMvc的使用](https://www.cnblogs.com/NeverCtrl-C/p/8996564.html)
- [GitHub JsonPath](https://github.com/json-path/JsonPath)

```vim
# Build the server and also make its dependencies
$ ./mvnw -Dlicense.skip=true -DskipTests --also-make -pl zipkin-server clean install
# Run the server
$ java -jar ./zipkin-server/target/zipkin-server-*exec.jar
```
- [Elasticsearch](https://www.elastic.co)
- [画图工具](https://about.draw.io)

## 启动命令

### [Elasticsearch](https://www.elastic.co/cn/downloads/elasticsearch)

```vim
Run bin/elasticsearch
```

### [zkikin](https://github.com/openzipkin/zipkin/blob/master/zipkin-server/README.md#elasticsearch-storage)

```vim
$ STORAGE_TYPE=elasticsearch ES_HOSTS=http://localhost:9200 java -jar zipkin.jar
```

## MySql时区

#### 查看时区

```sql
show variables where variable_name like '%time_zone'
```

#### 时区设置
```sql
set global time_zone = '+8:00';
set time_zone = '+8:00';
flush privileges;
```

## 遇到的问题解决方案
- https://blog.csdn.net/gelusheng123456/article/details/79684554
- https://blog.csdn.net/lidongpeng111/article/details/81318234
- zuul网关服务超时 https://github.com/spring-cloud/spring-cloud-netflix/issues/2064



https://github.com/devefx/validator-web
https://github.com/hibernate/hibernate-validator
https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted



