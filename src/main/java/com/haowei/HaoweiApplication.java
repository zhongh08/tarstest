package com.haowei;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTarsServer
public class HaoweiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaoweiApplication.class, args);
    }

}
