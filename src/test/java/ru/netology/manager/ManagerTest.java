package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

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
    public void overLimitTest() {
        Manager manager = new Manager(5);
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
    public void lessLimitTest() {
        Manager manager = new Manager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.findAll();
        manager.findLast();

        Movie[] actual = manager.findLast();
        Movie[] expected = {second,first};
        Assertions.assertArrayEquals (actual, expected);

    }
    @Test
    public void equalLimitTest() {
        Manager manager = new Manager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.findAll();
        manager.findLast();

        Movie[] actual = manager.findLast();
        Movie[] expected = {fifth, fourth, third, second, first};
        Assertions.assertArrayEquals (actual, expected);

    }
    @Test
    public void AllMovieTest() {
        Manager manager = new Manager();
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

