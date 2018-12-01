package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sample112302Application {

	public static void main(String[] args) {
		SpringApplication.run(Sample112302Application.class, args);
	}
	
	@Bean
	public HealthIndicator myHealth() {
		return ()->{
			return Health.down().withDetail("error", 404).build();
		};
	}
}
