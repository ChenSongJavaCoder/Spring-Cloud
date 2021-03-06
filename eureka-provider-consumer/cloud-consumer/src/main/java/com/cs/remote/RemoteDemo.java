package com.cs.remote;

import com.cs.entity.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ChenSong
 * @Date: 2018/4/9 11:14
 * @Description: 消费服务提供者的服务
 */
@FeignClient(name = "cloud-provider")
public interface RemoteDemo {

    /**
     * 1
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    String helloWorld(@RequestParam(value = "name") String name);

    /**
     * 2
     * @return
     */
    @RequestMapping("/findPerson")
    Person findPerson();
}
