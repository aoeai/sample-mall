# 《Spring微服务实战》的实战

## 参考资料

- [Mybatis](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
- [spring boot + mybatis + druid](https://www.cnblogs.com/waterlufei/p/7056420.html)
- [Druid](https://github.com/alibaba/druid)
- [如何在Spring Boot中集成Druid连接池和监控？](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter)
- [Druid Spring Boot Starter](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter)
- [MyBatis工具 分页插件 PageHelper、通用 Mapper](http://mybatis.tk)
- [zipkin](https://zipkin.io)
- [zipkin-server启动说明](https://github.com/openzipkin/zipkin/tree/master/zipkin-server)

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



