package fr.miage.m1.big_data_m1_23_24;

import fr.miage.m1.big_data_m1_23_24.entity.GPS;
import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.repositories.mongo.PointInteretMongoDBRepository;
import fr.miage.m1.big_data_m1_23_24.repositories.redis.PointInteretRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.UUID;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "fr.miage.m1.big_data_m1_23_24.repositories.mongo") // Pour dire où se trouve les repositories mongo
@EnableRedisRepositories(basePackages = "fr.miage.m1.big_data_m1_23_24.repositories.redis") // Pour dire où se trouve les repositories redis
public class BigDataM12324Application {

	@Autowired
	private StringRedisTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(BigDataM12324Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PointInteretMongoDBRepository pointInteretMongoDBRepository,
										PointInteretRedisRepository pointInteretRedisRepository) {
		return args -> {
			// Create a new PointInteret
			PointInteret pointInteret = new PointInteret();
			pointInteret.setUuid(UUID.randomUUID());
			pointInteret.setPo_description("Description du point d'intérêt");
			pointInteret.setPo_lien_photo("http://example.com/photo.jpg");
			pointInteret.setPo_gps(new GPS(48.8566, 2.3522)); // Exemple de coordonnées GPS (latitude et longitude)



			// Save the pointInteret through Redis and MongoDB repositories
			pointInteretMongoDBRepository.save(pointInteret);
			pointInteretRedisRepository.save(pointInteret);


			// Fetch all points interets from Redis and MongoDB repositories
			System.out.println(pointInteretMongoDBRepository.findAll());
			System.out.println(pointInteretRedisRepository.findAll());

		};
	}

	/*@Bean
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
	}*/
}