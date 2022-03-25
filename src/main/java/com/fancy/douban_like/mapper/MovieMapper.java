package com.fancy.douban_like.mapper;

import com.fancy.douban_like.model.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {

    Movie getMovieInfoById(String movieId);
    List<Movie> getAllMovies();
    List<Movie> getMoviesByKeyWords(String movieName);

}
