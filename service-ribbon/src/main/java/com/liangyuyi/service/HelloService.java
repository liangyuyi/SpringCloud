package com.liangyuyi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangyuyi
 * @date 2018/10/8
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand 通过fallbackMethod 指定服务请求失败时的响应方法
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://CLIENT-1/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
