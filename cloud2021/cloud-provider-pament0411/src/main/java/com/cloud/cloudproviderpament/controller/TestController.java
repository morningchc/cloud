package com.cloud.cloudproviderpament.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.cloudproviderpament.entity.PfCombElementEvent;
import com.cloud.cloudproviderpament.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2021/4/12.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;


    @PostMapping("/selectTest")
    public String selectTest(){
        String res = "";

        List<PfCombElementEvent> list = testService.selectAll();

        res = JSON.toJSONString(list);

        return res;
    }

}

