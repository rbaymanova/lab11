package com.example.lab11.task5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/convert")
    public String convert(@RequestParam int temp) {
        double result = (temp * 9/5) + 32;
        return Double.toString(result);
    }
}
