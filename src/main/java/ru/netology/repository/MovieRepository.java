package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

public class MovieRepository {
    private Movie[] movies = new Movie[0];

    public void save(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int newMovie = tmp.length - 1;
        tmp[newMovie] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        Movie[] tmp = new Movie[length];
        int copy = 0;
        for (Movie movie : movies) {
            if (movie.getId() != id) {
                tmp[copy] = movie;
                copy++;
            }
        }
        movies = tmp;
    }

    public Movie[] findById(int id) {
        int length = movies.length - 1;
        Movie[] tmp = new Movie[length];
        int copy = 0;
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                tmp[copy] = movie;
            } else {
                return null;
            }
        }
        return tmp;
    }

    public Movie[] removeAll() {
        Movie[] tmp = new Movie[0];
        return tmp;
    }
}
