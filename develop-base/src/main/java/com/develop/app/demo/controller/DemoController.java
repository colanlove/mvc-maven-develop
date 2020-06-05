package com.develop.app.demo.controller;

import com.develop.app.demo.service.DemoService;
import com.develop.common.response.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class DemoController {

    @Resource
    DemoService demoService;

    @RequestMapping("/test")
    public Map<String, Object> test() {

        Map<String, Object> map = CommonResponse.success(demoService.test());

        return map;
    }
}
