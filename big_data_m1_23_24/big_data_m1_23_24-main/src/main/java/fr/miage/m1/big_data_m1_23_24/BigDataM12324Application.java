package fr.miage.m1.big_data_m1_23_24;

import fr.miage.m1.big_data_m1_23_24.entity.User;
import fr.miage.m1.big_data_m1_23_24.repositories.FileRepository;
import fr.miage.m1.big_data_m1_23_24.repositories.UserRepository;
import fr.miage.m1.big_data_m1_23_24.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BigDataM12324Application {

	public static void main(String[] args) {
		SpringApplication.run(BigDataM12324Application.class, args);
	}

	@Bean
	CommandLineRunner start(@Qualifier("userServiceJpaImpl") UserService userJpaService, @Qualifier("userServiceFileImpl") UserService userFileService) {
		return args -> {
			User user = User.builder().firstname("Bob").lastname("Doe").build();
			userJpaService.create(user);
			userFileService.create(user);
		};
	}

}
