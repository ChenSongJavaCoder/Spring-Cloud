package com.cs.controller;

import com.cs.common.BaseLog;
import com.cs.demomodule.facade.Remote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author: ChenSong
 * @Date: 2018/11/27 10:07
 * @Description:
 */
public abstract class AbstractController extends BaseLog implements Remote {

    /**
     * 首页信息
     *
     * @return
     */
    @GetMapping("/index")
    public abstract String index();


    /**
     * 打个招呼吧
     *
     * @param name
     * @return
     */
    @GetMapping("/hello")
    public abstract String hello(String name);

    /**
     * 打个招呼吧
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/say/{name}")
    public abstract String say(@PathVariable(required = false) String name);
}
