package com.demo.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SnowWolf
 * @Date: 2022/02/15/2:25 PM
 * @Description:
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ArchTrainingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArchTrainingApplication.class, args);
    }
}
