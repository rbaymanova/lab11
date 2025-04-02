package com.example.lab11.task5;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task5Controller {
    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }


}
