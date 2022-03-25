package com.fancy.douban_like.controller;


import com.fancy.douban_like.mapper.WorkerMapper;
import com.fancy.douban_like.model.Worker;
import com.fancy.douban_like.service.WorkerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class WorkerController {

   @Resource
   WorkerService workerService;


   @GetMapping("/worker/id/{workerId}")
   public ModelAndView queryWorkerById(@PathVariable String workerId) {
      Worker worker = workerService.findWorkerById(workerId);
      ModelAndView mv = new ModelAndView();
      mv.addObject("worker", worker);
      mv.setViewName("worker_info");
      return mv;
   }
}
