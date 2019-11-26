package com.top.sttop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.top.sttop.system.mapper"})
public class SttopApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(SttopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SttopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("服务启动完成！");
    }
}
