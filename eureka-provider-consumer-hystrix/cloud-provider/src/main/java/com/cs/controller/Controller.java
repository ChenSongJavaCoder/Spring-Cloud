package com.cs.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Author: ChenSong
 * @Date: 2018/11/27 10:05
 * @Description:
 */
@RestController
public class Controller extends AbstractController {

    @Override
    public String index() {
        LOG.info("Hi! 这是服务提供者的页面");
        return "Hi! 这是服务提供者的页面";
    }

    @Override
    public String hello(String name) {
        return "Hi," + name + "! 欢迎来到Spring Cloud!";
    }

    @Override
    public String say(@PathVariable(required = false) String name) {

        return "Hi," + (name != null ? name : "XX") + "! Nice to meet you!";
    }


    @Override
    public String remoteForString(String str) {
        return "hello," + str + "! Remote success!";
    }
}
