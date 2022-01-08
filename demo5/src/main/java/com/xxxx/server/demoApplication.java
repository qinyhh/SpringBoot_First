package com.xxxx.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author qinyh
 * @date 2022/1/8
 */
@SpringBootApplication
@MapperScan("com.xxxx.server.mapper")
public class demoApplication {
    public static void main(String[] args) {
        SpringApplication.run(demoApplication.class,args);
    }
}
