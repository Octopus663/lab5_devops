package com.coursework.lab5_dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String index() {
        return "DevOps Lab is Running! ";
    }
}
