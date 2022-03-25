package com.fancy.douban_like.service;

import com.fancy.douban_like.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMovies();
    List<Movie> findMoviesByKeyWords(String keyword);
    Movie findMovieById(String movieId);

}
