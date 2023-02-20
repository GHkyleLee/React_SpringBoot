package com.culture.scheduler.scheduler.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
        
}
