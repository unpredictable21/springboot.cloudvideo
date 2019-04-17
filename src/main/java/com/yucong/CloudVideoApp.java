package com.yucong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudVideoApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CloudVideoApp.class);
        app.run(args);
    }
}
