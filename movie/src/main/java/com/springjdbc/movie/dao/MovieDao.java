package com.springjdbc.movie.dao;

import java.util.List;
import java.util.Optional;

import com.springjdbc.movie.movie.Movie;

public interface MovieDao {
    
    List<Movie> selectMovies();
    int insertMovie(Movie movie);
    int deleteMovie(int id);
    Optional<Movie> selectMovieById(int id);
}
