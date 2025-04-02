package com.example.lab11.task5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int x, @RequestParam int y, @RequestParam String operation) {
        double result = 0;
        switch (operation) {
            case "add":
                result = x + y;
            case "subtract":
                result = x - y;
            case "multiply":
                result = x * y;
            case "divide":
                if (y == 0) {
                    return "Cannot divide by zero!";
                }
                result = x / y;
        }
        return "Result is: " + result;
    }
}
