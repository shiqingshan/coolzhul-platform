package com.coolzhul.admin.test.controller;

import com.coolzhul.admin.test.service.ITestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {
    private final ITestService testService;
    @RequestMapping("/test")
    public String test(){
        testService.insertTest();
        return "succ";
    }
}
