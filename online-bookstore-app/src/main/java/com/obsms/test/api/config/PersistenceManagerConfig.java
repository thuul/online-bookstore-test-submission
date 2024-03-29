package com.obsms.test.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class PersistenceManagerConfig {

    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    public EntityManager getEM(){
        return entityManager;
    }
}
