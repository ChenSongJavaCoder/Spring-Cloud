package com.cs.controller;

import com.cs.remote.biz.RemoteServiceBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChenSong
 * @Date: 2018/11/27 12:47
 * @Description:
 */
@Slf4j
@RestController
public class ConsumerController {

    @Autowired
    RemoteServiceBiz remoteServiceBiz;



    @GetMapping("/remote")
    public String remote(String str) {
        log.info("Consumer receives data {}", str);
        return remoteServiceBiz.remoteForString(str);
    }
}
