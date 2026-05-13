package com.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // ← එකතු කරන්න (scheduler සඳහා)
public class RmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(RmsApplication.class, args);
        System.out.println("=========================================");
        System.out.println("Restaurant Reservation Platform Started!");
        System.out.println("Access at: http://localhost:8080");
        System.out.println("=========================================");
    }
}