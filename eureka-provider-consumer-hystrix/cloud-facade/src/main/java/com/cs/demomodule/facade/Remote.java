package com.cs.demomodule.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ChenSong
 * @Date: 2018/11/27 11:19
 * @Description:
 */
@RequestMapping(value = "/api")
public interface Remote {
    /**
     * s
     * @param str
     * @return
     */
    @RequestMapping(value = "/remoteForString")
    String remoteForString(@RequestParam(value = "str") String str);
}
