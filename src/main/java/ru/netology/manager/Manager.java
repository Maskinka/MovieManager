package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.Movie;

@Data
public class Manager {
    private Movie[] movies = new Movie[0];
    private int resultLength = 10;

    public Manager() {
    }

    public Manager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void addMovie(Movie movie) {
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

    public Movie[] findLast() {

        if (movies.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}


