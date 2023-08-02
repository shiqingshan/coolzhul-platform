package com.coolzhul.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class ApplicationWorkflowService {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationWorkflowService.class,args);
    }
}
