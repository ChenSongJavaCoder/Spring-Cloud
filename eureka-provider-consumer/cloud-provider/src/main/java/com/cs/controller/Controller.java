package com.cs.controller;

import com.cs.entity.Person;
import com.cs.logs.BaseLogs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChenSong
 * @Date: 2018/4/9 10:58
 * @Description:
 */

@RestController
public class Controller extends BaseLogs{

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        String helloWorld = "helloWorld! by ";
        return helloWorld + name;
    }


    @RequestMapping("/findPerson")
    public Person findPerson(){
        return new Person("陈松",25,"男");
    }

}
