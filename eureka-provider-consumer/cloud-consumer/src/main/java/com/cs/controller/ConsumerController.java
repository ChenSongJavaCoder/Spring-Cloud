package com.cs.controller;

import com.cs.entity.Person;
import com.cs.logs.BaseLogs;
import com.cs.remote.RemoteDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ChenSong
 * @Date: 2018/4/9 11:13
 * @Description:
 */
@RestController
public class ConsumerController extends BaseLogs {

    @Autowired
    RemoteDemo remote;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        LOG.info("----------调用helloWorld成功！！当前时间：" + sdf.format(new Date()) + " by " + name + "-----------------");
        return remote.helloWorld(name);
    }

    @RequestMapping("/findPerson")
    public Person findPerson() {
        LOG.info("----------调用findPerson成功！！当前时间：" + sdf.format(new Date()) + "-----------------");
        return remote.findPerson();
    }

}
