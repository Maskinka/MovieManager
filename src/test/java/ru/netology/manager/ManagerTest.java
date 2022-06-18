package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.Movie;
import ru.netology.repository.MovieRepository;

import static org.mockito.Mockito.doReturn;

public class ManagerTest {
    Movie first = new Movie(1);
    Movie second = new Movie(2);
    Movie third = new Movie(3);
    Movie fourth = new Movie(4);
    Movie fifth = new Movie(5);
    Movie sixth = new Movie(6);
    Movie seventh = new Movie(7);
    Movie eights = new Movie(8);
    Movie ninths = new Movie(9);
    Movie tenth = new Movie(10);
    Movie eleventh = new Movie(11);

   @Test
    public void movieTest() {
        MovieRepository repository = new MovieRepository();
        Manager manager = new Manager(5, (repository));
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.findAll();
        manager.findLast();

        Movie[] actual = manager.findLast();
        Movie[] expected = {sixth, fifth, fourth, third, second};
        Assertions.assertArrayEquals (actual, expected);

    }
    @Test
    public void AllMovieTest() {
        MovieRepository repository = new MovieRepository();
        Manager manager = new Manager(repository);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.findAll();
        manager.findLast();

        Movie[] actual = manager.findLast();
        Movie[] expected = {sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals (actual, expected);

    }
}

