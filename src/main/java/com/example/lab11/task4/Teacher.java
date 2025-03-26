package com.example.lab11.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teacher {
    private String name;
    private String subject;

    @GetMapping("/teacher")
    public String teacher(){
        return " Teacher : " + name + ", Subject : " + subject ;
    }
}
