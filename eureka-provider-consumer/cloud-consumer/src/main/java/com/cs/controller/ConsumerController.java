package com.cs.controller;

import com.cs.logs.BaseLogs;
import com.cs.remote.RemoteDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChenSong
 * @Date: 2018/4/9 11:13
 * @Description:
 */
@RestController
public class ConsumerController extends BaseLogs {

    @Autowired
    RemoteDemo remote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return remote.helloWorld(name);
    }

}
