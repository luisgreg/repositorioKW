package com.keywords.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TesteJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteJavaApplication.class, args);

	}


}
