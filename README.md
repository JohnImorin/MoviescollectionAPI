# Movie Collection REST API

A Spring Boot REST API for managing a personal movie collection with filtering and sorting capabilities.

## Features

- Full CRUD operations for movies
- Filter movies by genre, rating, and release year
- Sort and organize your collection
- PostgreSQL database integration
- Clean architecture (Entity, Repository, Service, Controller)
- RESTful API design

## Tech Stack

Java 23 | Spring Boot 3 | PostgreSQL | JPA/Hibernate | REST API

## Getting Started

```bash
git clone https://github.com/JohnImorin/MoviescollectionAPI.git
cd MoviescollectionAPI
```

Configure `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://your-host/movie_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Run:
```bash
mvn spring-boot:run
```

API runs on `http://localhost:8080`

## API Endpoints

- `GET /api/movies` - Get all movies
- `GET /api/movies/{id}` - Get movie by ID
- `POST /api/movies` - Add new movie
- `PUT /api/movies/{id}` - Update movie
- `DELETE /api/movies/{id}` - Delete movie
- `GET /api/movies/genre/{genre}` - Filter by genre
- `GET /api/movies/rating/{rating}` - Filter by rating

## Author

John Fabrice Imorin | CS Graduate | Junior Backend Developer  
📧 johnsteiner900@gmail.com | 🔗 [LinkedIn](https://linkedin.com/in/john-fabrice-imorin-526a4722b)
