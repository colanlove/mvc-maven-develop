package com.develop.app.demo.service.impl;

import com.develop.app.demo.mapper.UserMapper;
import com.develop.app.demo.service.DemoService;
import com.develop.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 演示用的demo service
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static Logger logger = LogManager.getLogger();

    @Resource
    private UserMapper userMapper;

    /**
     * test方法，给controller test用的
     */
    @Override
    public List testMethod(String str) {
        logger.info("service里的log 用户入参: " + str);

        List<User> userList = userMapper.getUsers();

        return userList;
    }
}
