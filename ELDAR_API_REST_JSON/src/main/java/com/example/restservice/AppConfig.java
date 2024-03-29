package com.example.restservice;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@EnableJpaRepositories
@ComponentScan
@Configuration
public class AppConfig {

  @Bean
  public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
      Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
      factory.setResources(new Resource[] { new ClassPathResource("operaciones.JSON")});
      return factory;
  }

  @Bean
  EntityManagerFactory entityManagerFactory() {
      EntityManagerFactory emf =
              Persistence.createEntityManagerFactory("example-unit");
      return emf;
  }

  @Bean
  public PlatformTransactionManager transactionManager() {
      JpaTransactionManager txManager = new JpaTransactionManager();
      txManager.setEntityManagerFactory(entityManagerFactory());
      return txManager;
  }
}
