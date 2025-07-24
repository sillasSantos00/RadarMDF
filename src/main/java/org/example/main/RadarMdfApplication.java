package org.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.example")
@EntityScan(basePackages = "org.example.produto")
@EnableJpaRepositories(basePackages = "org.example.repository")
public class RadarMdfApplication {
    public static void main(String[] args) {
        SpringApplication.run(RadarMdfApplication.class, args);
    }
}
