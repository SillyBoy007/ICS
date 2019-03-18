package com.wxy.ics.member.controller;

import com.wxy.ics.member.domain.Test;
import com.wxy.ics.member.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 *TestController
 * @author wxy
 * @date 2019/03/14
 */
@RestController
public class TestController  {
    @Autowired
    TestService testService;
    @GetMapping("/test")
    public List<Test> test(){
        List<Test> tests = testService.selectAll();
        return tests;
    }

}
