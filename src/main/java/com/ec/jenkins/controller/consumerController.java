package com.ec.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class consumerController {
    @RequestMapping("/jenkins/hello")
    public String hello(){
        return "hello dockers";
    }
}
