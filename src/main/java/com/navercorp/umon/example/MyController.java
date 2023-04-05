package com.navercorp.umon.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        return "call url: http://{hostname}:{port}/name={value}<br>name = " + name;
    }
}
