package com.culture.scheduler.scheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value =  {"", "/test"})
    public String forward() {
        return "forward:/index.html";
    }
}