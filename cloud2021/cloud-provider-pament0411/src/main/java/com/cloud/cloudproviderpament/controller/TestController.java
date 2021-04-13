package com.cloud.cloudproviderpament.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.cloudproviderpament.common.CommonResult;
import com.cloud.cloudproviderpament.common.CommonSearch;
import com.cloud.cloudproviderpament.entity.PfCombElementEvent;
import com.cloud.cloudproviderpament.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2021/4/12.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/testPost")
    public CommonResult testPost(@RequestBody CommonSearch search){
        CommonResult res = new CommonResult();
        return res;
    }

    @PostMapping("/testList/{pageSize}/{pageIndex}")
    public CommonResult testGet(@RequestBody CommonSearch search, @PathVariable int pageSize, @PathVariable int pageIndex){
        CommonResult res = new CommonResult();
        return res;
    }

    @PostMapping("/selectTest")
    public String selectTest(){
        String res = "";

        List<PfCombElementEvent> list = testService.selectAll();

        res = JSON.toJSONString(list);

        return res;
    }


}

