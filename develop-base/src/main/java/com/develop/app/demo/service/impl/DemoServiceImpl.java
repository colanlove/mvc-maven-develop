package com.develop.app.demo.service.impl;

import com.develop.app.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String test() {
        return "demo test method";
    }
}
