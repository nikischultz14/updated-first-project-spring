package com.nikischultz.firstprojectspring.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.nikischultz.firstprojectspring.model"})
@EnableJpaRepositories(basePackages = {"com.nikischultz.firstprojectspring.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
