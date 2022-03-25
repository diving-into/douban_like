package com.fancy.douban_like.mapper;

import com.fancy.douban_like.model.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerMapper {

    List<Worker> getWorkersByMovieId(String movieId);
    Worker getOneWorkerByWorkerId(String workerId);

}
