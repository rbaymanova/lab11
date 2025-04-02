package com.example.lab11.other;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Task6 {
    @GetMapping("/student-info")
    public Map<String,Object> getStudentInfo() {
        Map<String,Object> response = new HashMap<>();
        response.put("name","Ali");
        response.put("age", 21);
        response.put("status", "active");
        return response ;
    }
    @GetMapping("/course-info")
    public Map<String, Object> getCourseInfo() {
        Map<String, Object> course = new HashMap<>();
        course.put("title", "Java Programming");
        course.put("description", "Learn Java from basics to advanced.");
        course.put("duration", "6 months");
        return course;
    }
    @GetMapping("/product-details")
    public Map<String,Object> getProductInfo() {
        Map<String,Object> product = new HashMap<>();
        product.put("name","Apple");
        product.put("category", "technology");
        product.put("price", 499.99);
        product.put("stock", "active");
        return product;
    }
    @GetMapping("/user-profile")
    public Map<String, Object> getUserProfile() {
        Map<String, Object> profile = new HashMap<>();
        profile.put("name", "Roxanne");
        profile.put("email", "roxanne@example.com");
        profile.put("role", "Student");
        return profile;
    }
    @GetMapping("/order-summary")
    public Map<String, Object> getOrderSummary() {
        Map<String, Object> order = new HashMap<>();
        order.put("orderID", 12345);
        order.put("customerName", "John Doe");

        List<Map<String, Object>> items = new ArrayList<>();
        Map<String, Object> item1 = new HashMap<>();
        item1.put("name", "Laptop");
        item1.put("quantity", 1);
        item1.put("price", 1200.99);
        items.add(item1);

        order.put("items", items);
        order.put("totalCost", 1200.99);
        return order;
    }
}
