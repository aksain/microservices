package com.aksain.msa.author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aksain.msa.author")
public class AuthorServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorServicesApplication.class, args);
	}
}
