package com.example.lab11.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book {
    private String title;
    private String author;
    private int price;

    @GetMapping("/book")
    public String book() {
        return "Book title " + title + " author " + author + " price " + price;
    }
}
