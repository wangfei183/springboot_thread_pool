package com.example.springboot_thread_pool.service.impl;

import com.example.springboot_thread_pool.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);
    int i=0;
//    @Override
//    public void executeAsync() {
//        logger.info("start executeAsync");
//        try{
//            Thread.sleep(1000);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        logger.info("end executeAsync");
//    }


    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() {
//        logger.info("start executeAsync");
        try{
            Thread.sleep(10000);
            System.out.println("执行业务逻辑"+i++);
        }catch(Exception e){
            e.printStackTrace();
        }
//        logger.info("end executeAsync");
    }

}
