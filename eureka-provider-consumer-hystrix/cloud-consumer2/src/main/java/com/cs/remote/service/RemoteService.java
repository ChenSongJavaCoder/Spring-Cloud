package com.cs.remote.service;

import com.cs.demomodule.facade.Remote;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ChenSong
 * @Date: 2018/11/27 11:42
 * @Description:
 */
@FeignClient(name = "cloud-provider", fallback = RemoteService.RemoteHystrix.class)
public interface RemoteService extends Remote{
    class RemoteHystrix implements RemoteService {
        @Override
        public String remoteForString(@RequestParam(value = "str") String str) {

            return "hello," + str + "! Remote fail!";
        }
    }
}
