package com.example.demo.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/helloworld")
    public String hello() {
        return "Hello World";
    }
}
