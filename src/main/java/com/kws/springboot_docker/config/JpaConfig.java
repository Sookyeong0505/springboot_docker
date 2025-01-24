package com.kws.springboot_docker.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@EntityScan(basePackages = "com.kws.springboot_docker.entity")
@EnableJpaRepositories(basePackages = "com.kws.springboot_docker.repository")
public class JpaConfig {
    @PersistenceContext
    private final EntityManager entityManager;
    @Bean
    public JpaRepositoryFactory jpaRepositoryFactory() {
        return new JpaRepositoryFactory(entityManager);
    }
}
