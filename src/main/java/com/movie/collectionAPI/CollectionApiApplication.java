package com.movie.collectionAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = "com.movie.collectionAPI.movies"
)
public class CollectionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApiApplication.class, args);
	}

}
