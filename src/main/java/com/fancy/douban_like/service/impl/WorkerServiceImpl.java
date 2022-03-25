package com.fancy.douban_like.service.impl;

import com.fancy.douban_like.mapper.WorkerMapper;
import com.fancy.douban_like.model.Worker;
import com.fancy.douban_like.service.WorkerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Resource
    WorkerMapper workerMapper;


    @Override
    public Worker findWorkerById(String workerId) {
        return workerMapper.getOneWorkerByWorkerId(workerId);
    }
}
