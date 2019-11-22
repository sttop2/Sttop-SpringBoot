package com.top.sttop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.top.sttop.system.mapper"})
public class SttopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SttopApplication.class, args);
    }

}
