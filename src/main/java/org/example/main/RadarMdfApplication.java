package org.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "org.example.repository")
@SpringBootApplication(scanBasePackages = "org.example")
public class RadarMdfApplication {
    public static void main(String[] args) {
        SpringApplication.run(RadarMdfApplication.class, args);
    }
}

