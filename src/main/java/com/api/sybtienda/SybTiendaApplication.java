package com.api.sybtienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.api.sybtienda.Modelos")

public class SybTiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SybTiendaApplication.class, args);
	}

}
