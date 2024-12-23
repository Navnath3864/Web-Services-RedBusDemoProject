package com.redbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RedBusAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedBusAppApplication.class, args);
		System.out.println("RedBusAppApplication-->8083");
	}

	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}

}
