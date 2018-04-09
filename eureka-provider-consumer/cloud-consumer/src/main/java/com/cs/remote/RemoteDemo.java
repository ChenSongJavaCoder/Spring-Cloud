package com.cs.remote;

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

    @RequestMapping("/hello")
    String helloWorld(@RequestParam(value = "name") String name);

}
