package com.example.angularjs.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.angularjs"})
@EntityScan(basePackages={"com.example.angularjs.data.entity"})
@EnableJpaRepositories(basePackages={"com.example.angularjs.data.repository"})
public class AngularjsPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularjsPlaygroundApplication.class, args);
	}
}
