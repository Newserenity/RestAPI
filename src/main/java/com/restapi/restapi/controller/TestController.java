package com.restapi.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/") //기본경로로 접근시
    public String index() {
        return "Hello World"; //메세지 반환
    }
}
