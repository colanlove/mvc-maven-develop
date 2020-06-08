package com.develop.app.demo.service.impl;

import com.develop.app.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * 演示用的demo service
 */
@Service
public class DemoServiceImpl implements DemoService {


    /**
     * test方法，给controller test用的
     */
    @Override
    public String testMethod() {
        return "demo test2 method";
    }
}
