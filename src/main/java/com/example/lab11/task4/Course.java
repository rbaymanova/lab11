package com.example.lab11.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Course {
    private String title;
    private String duration;
    @GetMapping("/course")
    public String course(){
        return " Course name : " + title + ", duration : " + duration ;
    }
}
