package com.example.lab11.task4;

import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    private String name = "Ali";
    private int age = 21;
    @GetMapping ("/student")
    public String getStudent () {
        return " Student : " + name + ", Age: " + age ;
    }
    @GetMapping("/is-adult/{age}")
    public String isAdult ( @PathVariable int age ) {
        if ( age >= 18) {
            return " Age " + age + ": You are an adult .";
        } else {
            return " Age " + age + ": You are not an adult .";
        }
    }

    @PostMapping("update-student/age/{newAge}")
    public String update(@PathVariable int newAge) {
        this.age = newAge;
        return "Student age updated to " + newAge;
    }
}

