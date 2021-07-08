package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JPA Config
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
public class JpaConfig {

}
