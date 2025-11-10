package com.tavvi.tavvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TavviApplication {

    public static void main(String[] args) {
        SpringApplication.run(TavviApplication.class, args);
    }

}
