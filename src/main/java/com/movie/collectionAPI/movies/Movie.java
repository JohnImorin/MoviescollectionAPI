package com.movie.collectionAPI.movies;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "movie")
public class Movie {
    @Id

    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_id_generator"
    )
    private long id;
    private String genre;
    private String title;
    private String director;
    private double rating;
    private int releaseYear;


    public Movie() {
    }

    public Movie(long id, String genre, String title, String director, double rating, int releaseYear) {
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public Movie(String genre, String title, String director, double rating, int releaseYear) {
        this.genre = genre;
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
