package com.example.prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/jump URL")
    @ResponseBody
    public String hello() {
        return "점프 투 스프링 부트";
    }
}
