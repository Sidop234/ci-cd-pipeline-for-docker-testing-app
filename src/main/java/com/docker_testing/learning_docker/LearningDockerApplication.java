package com.docker_testing.learning_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LearningDockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningDockerApplication.class, args);
    }
}
