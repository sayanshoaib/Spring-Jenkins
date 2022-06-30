package com.example.springjenkings;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJenkingsApplication {

    public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkingsApplication.class);

    public void init() {
        logger.info("Application started...");
    }

    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(SpringJenkingsApplication.class, args);
    }

}
