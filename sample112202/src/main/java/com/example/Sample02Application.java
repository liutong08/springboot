package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sample02Application {

	public static void main(String[] args) {
		System.out.println("before------");
		SpringApplication.run(Sample02Application.class, args);
		System.out.println("after------");
	}

	@Bean
	public static CommandLineRunner testA() {
		CommandLineRunner runner = new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("i am testA");
			}
		};
		return runner;
	}
	
}
