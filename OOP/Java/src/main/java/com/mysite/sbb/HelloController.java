package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/jump")
    @ResponseBody
    public String hello() {
        return "Jump to Springboot";
    }
}
