package com.movie.collectionAPI.movies;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRespository extends JpaRepository<Movie, Long> {


    // Bonus features — Spring JPA jenere SQL otomatikman!
    List<Movie> findByGenre(String genre);
    List<Movie> findByDirector(String director);
    List<Movie> findByReleaseYearAfter(int year);
    List<Movie> findByRatingGreaterThan(double rating);




}
