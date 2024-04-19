package fr.miage.m1.big_data_m1_23_24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class BigDataM12324Application {

	@Autowired
	private StringRedisTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(BigDataM12324Application.class, args);
	}

	@Bean
	CommandLineRunner start() {
		return args -> {
			String originalValue = "value";
			template.opsForValue().set("key", originalValue);
			String returnedValue = template.opsForValue().get("key");

			if (originalValue.equals(returnedValue)) {
				System.out.println("Redis is working correctly");
			} else {
				System.out.println("There seems to be a problem with Redis");
			}
		};
	}
}