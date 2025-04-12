package com.selidrissi.testcontainers;


import com.selidrissi.testcontainers.config.MyContainersConfiguration;
import org.springframework.boot.SpringApplication;

public class TestMyApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestcontainersApplication::main)
                .with(MyContainersConfiguration.class)
                .run(args);
    }
}
