package com.fancy.douban_like.controller;

import com.fancy.douban_like.model.Movie;
import com.fancy.douban_like.service.MovieService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MovieController {

    @Resource
    MovieService movieService;

    @GetMapping("/index")
    public ModelAndView getAllMovies() {
        List<Movie> movies = movieService.findAllMovies();
        ModelAndView mv = new ModelAndView();
        mv.addObject("movies", movies);
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/movie/id/{movieId}")
    public ModelAndView queryMovieById(@PathVariable String movieId) {
        Movie movie = movieService.findMovieById(movieId);
        ModelAndView mv = new ModelAndView();
        mv.addObject("movie", movie);
        mv.setViewName("movie_info");
        return mv;
    }
}
