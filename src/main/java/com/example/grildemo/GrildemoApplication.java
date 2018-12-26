package com.example.grildemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.grildemo.mapper")
@SpringBootApplication
public class GrildemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrildemoApplication.class, args);
    }

}

