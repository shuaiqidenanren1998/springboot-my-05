package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.dao")
public class SpringbootMy05Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMy05Application.class, args);
    }

}
