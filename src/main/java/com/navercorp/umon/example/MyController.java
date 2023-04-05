package com.navercorp.umon.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
    @GetMapping
    public String test(String name) {
        return "call url: http://{hostname}:{port}/name={value}<br>name = " + name;
    }
}
