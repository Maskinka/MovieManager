package ru.netology.manager;

import ru.netology.domain.Movie;
import ru.netology.repository.MovieRepository;

public class Manager {
    private MovieRepository repository;
    private int resultLength = 10;
    public Manager(MovieRepository repository) {this.repository = repository;
    }
    public Manager(int resultLength, MovieRepository repository) {

        this.resultLength = resultLength;
        this.repository = repository;
    }



    public void addMovie(Movie movie) {
        repository.save(movie);
    }

    public Movie[] findAll() {
        Movie[] movies = repository.findAll();
        return movies;
    }

    public Movie[] findLast() {
        Movie[] movies = repository.findAll();

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


