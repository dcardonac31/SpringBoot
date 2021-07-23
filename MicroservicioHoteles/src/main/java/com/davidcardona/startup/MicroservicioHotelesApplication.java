package com.davidcardona.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.davidcardona.models"})
@EnableJpaRepositories(basePackages = {"com.davidcardona.dao"})
@ComponentScan(basePackages = {"com.davidcardona.controller", 
								"com.davidcardona.dao",
								"com.davidcardona.service"})
@SpringBootApplication
public class MicroservicioHotelesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioHotelesApplication.class, args);
	}

}
