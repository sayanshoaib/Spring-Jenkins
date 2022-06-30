package com.example.springjenkings;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkingsApplicationTests {

    public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkingsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing second log statement");
        assertEquals(true, true);
    }

}
