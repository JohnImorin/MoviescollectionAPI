package com.movie.collectionAPI.movies;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(MovieRespository movieRespository) {
        return args -> {
            Movie movie1 = new Movie(
                    "The Shawshank Redemption",
                    "Drama",
                    "Frank Darabont",
                    9.3,
                    1994
            );
            movieRespository.save(movie1);
        };
    }



}
