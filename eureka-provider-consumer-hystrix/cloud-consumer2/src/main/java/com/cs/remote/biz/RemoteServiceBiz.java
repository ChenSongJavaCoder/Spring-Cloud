package com.cs.remote.biz;

import com.cs.remote.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Author: ChenSong
 * @Date: 2018/11/27 12:43
 * @Description:
 */
@Component
public class RemoteServiceBiz {

    @Autowired
    private RemoteService remoteService;

    public String remoteForString(String str){
        // todo 相关业务处理
        return remoteService.remoteForString(str);
    }

}
