package com.develop.app.demo.service.impl;

import com.develop.app.demo.service.DemoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * 演示用的demo service
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static Logger logger = LogManager.getLogger();

    /**
     * test方法，给controller test用的
     */
    @Override
    public String testMethod(String str) {
        logger.info("service里的log");

        return "demo test method " + str;
    }
}
