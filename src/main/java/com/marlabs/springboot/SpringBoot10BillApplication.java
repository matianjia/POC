package com.marlabs.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.marlabs.springboot.mapper")

public class SpringBoot10BillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot10BillApplication.class, args);
    }

}
