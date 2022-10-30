package com.adem;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Mapper
public class Module2 {
    public static void main(String[] args) {
        SpringApplication.run(Module2.class, args);
    }
}
