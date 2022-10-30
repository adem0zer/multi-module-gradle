package com.adem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Mapper
public class Core {
    public static void main(String[] args) {
        SpringApplication.run(Core.class, args);
        Deneme a = new Deneme();
    }
}
