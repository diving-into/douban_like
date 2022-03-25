package com.fancy.douban_like.service.impl;

import com.fancy.douban_like.mapper.MovieMapper;
import com.fancy.douban_like.mapper.WorkerMapper;
import com.fancy.douban_like.model.Movie;
import com.fancy.douban_like.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    MovieMapper movieMapper;

    @Resource
    WorkerMapper workerMapper;

    @Override
    public List<Movie> findAllMovies() {
       return movieMapper.getAllMovies();
    }

    @Override
    public List<Movie> findMoviesByKeyWords(String keyword) {
        return movieMapper.getMoviesByKeyWords(keyword);
    }

    @Override
    public Movie findMovieById(String movieId) {
        Movie movie = movieMapper.getMovieInfoById(movieId);
        movie.setWorkerList(workerMapper.getWorkersByMovieId(movieId));
        return movie;
    }
}
