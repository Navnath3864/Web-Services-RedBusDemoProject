package com.gita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitaApplication.class, args);
		System.out.println("Gita-->8082");
	}

}
