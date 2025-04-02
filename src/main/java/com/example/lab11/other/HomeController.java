package com.example.lab11.other;

import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home () {
        return " Welcome to Home Page !";
    }
    @GetMapping ("/services")
    public String services () {
        return "<h2 >Our Services </h2 >"
                + "<ul >"
                + "<li > Web Development </li >"
                + "<li > Mobile App Development </li >"
                + "<li > SEO Optimization </li >"
                + " </ul >";
    }
    @GetMapping("/about")
    public String about () {
        return "<h2 >About app </h2 >"
                + "<p>This application is about ... and ...</p>";
    }
    @GetMapping("/faq")
    public String questions(){
        return "<h2 >Frequently asked questions</h2 >"
                + "<ol>"
                + "<li>Question 1</li>"
                + "<li>Question 2</li>"
                + "<li>Question 3</li>"
                + "</ol>";
    }
    @GetMapping("/contact-us")
    public String contact(){
        return "<h2 >Contact Us</h2 >"
                + "<p>email me: rbaymanova@gmail.com</p>"
                + "<p>tg handle @rbaymanova</p>";
    }
    @GetMapping("/team")
    public String team(){
        return "<h2 >Team</h2 >"
                + "<p>Ruxshona</p>"
                + "<p>Lobar</p>"
                + "<p>Xurliman</p>"
                + "<p>Gulira'no</p>";
    }
}
