package com.cdiopro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cdiopro.mapper")
@SpringBootApplication
public class CdioProApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdioProApplication.class, args);
    }

}
