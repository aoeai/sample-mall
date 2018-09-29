package com.aoeai.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages="com.aoeai.mall.mapper")
@ComponentScan(basePackages={"com.*"})
public class MallSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallSpringBootApplication.class, args);
    }


}
