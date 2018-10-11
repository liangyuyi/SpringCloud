package com.liangyuyi.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author liangyuyi
 * @date 2018/10/9
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
