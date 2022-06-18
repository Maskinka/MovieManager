package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.netology.domain.Movie;
import ru.netology.manager.Manager;


import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class RepositoryTest {
    @Mock
    private MovieRepository repository = Mockito.mock(MovieRepository.class);
    @InjectMocks
    private Manager manager = new Manager(repository);
    private Movie first = new Movie(1);
    private Movie second = new Movie(2);
    private Movie third = new Movie(3);



    @Test
    public void AllMovie(){
        Movie[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();

        Movie[] expected ={first, second, third};
        Movie[] actual = manager.findAll();
        Assertions.assertArrayEquals(actual, expected);

        verify(repository).findAll();
    }
    @Test
    public void SaveMovie(){
        Movie[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        Movie[] expected ={first, second, third};
        Movie[] actual = manager.findAll();
        Assertions.assertArrayEquals(actual, expected);

        verify(repository).findAll();
    }
}
