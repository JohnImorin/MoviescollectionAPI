package com.movie.collectionAPI.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;


@Service

public class MovieService {

    private final MovieRespository movieRespository;


    @Autowired
    public MovieService(MovieRespository movieRespository) {
        this.movieRespository = movieRespository;
    }



    public Optional<Movie> getMovieById(Long id) {
        return movieRespository.findById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRespository.save(movie);
    }

    public Movie updateMovie(Long id, Movie updatedMovie) {
        Movie existing = movieRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
        existing.setTitle(updatedMovie.getTitle());
        existing.setDirector(updatedMovie.getDirector());
        existing.setGenre(updatedMovie.getGenre());
        existing.setReleaseYear(updatedMovie.getReleaseYear());
        existing.setRating(updatedMovie.getRating());
        return movieRespository.save(existing);
    }

    public void deleteMovie(Long id) {
        movieRespository.deleteById(id);
    }

    // Bonus business logic
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRespository.findByGenre(genre);
    }

    public List<Movie> getMoviesByDirector(String director) {
        return movieRespository.findByDirector(director);
    }

    public List<Movie> getMoviesReleasedAfter(int year) {
        return movieRespository.findByReleaseYearAfter(year);
    }

    public List<Movie> getMoviesWithHighRating() {
        return movieRespository.findByRatingGreaterThan(8.0);
    }

    public long countMovies() {
        return movieRespository.count();
    }
}


