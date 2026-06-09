package com.movie.collectionAPI.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;


    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }



    // GET /movies/{id}
    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    // POST /movies
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    // PUT /movies/{id}
    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }

    // DELETE /movies/{id}
    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return "Movie deleted successfully.";
    }

    // Bonus endpoints
    @GetMapping("/genre/{genre}")
    public List<Movie> getByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/director/{director}")
    public List<Movie> getByDirector(@PathVariable String director) {
        return movieService.getMoviesByDirector(director);
    }

    @GetMapping("/year/after/{year}")
    public List<Movie> getReleasedAfter(@PathVariable int year) {
        return movieService.getMoviesReleasedAfter(year);
    }

    @GetMapping("/top-rated")
    public List<Movie> getTopRated() {
        return movieService.getMoviesWithHighRating();
    }

    @GetMapping("/count")
    public long countMovies() {
        return movieService.countMovies();
    }





}
