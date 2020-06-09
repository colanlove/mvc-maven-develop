package com.develop.app.demo.controller;

import com.develop.app.demo.service.DemoService;
import com.develop.common.response.CommonResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * demo演示用的controller
 */
@RestController
public class DemoController {

    private static Logger logger = LogManager.getLogger();

    // 演示用的service注入
    @Resource
    private DemoService demoService;

    /**
     * test方法
     * 返回json报文
     *
     * @return map
     */
    @RequestMapping("/test")
    public Map test(String str) {

        logger.info("controller里的log");
        return CommonResponse.custom("8888", "测试消息", demoService.testMethod(str));
    }

}
