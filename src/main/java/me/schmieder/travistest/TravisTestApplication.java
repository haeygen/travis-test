package me.schmieder.travistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravisTestApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(TravisTestApplication.class, args);
    }
}
