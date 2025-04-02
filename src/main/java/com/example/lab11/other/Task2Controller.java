package com.example.lab11.other;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task2Controller {
    @GetMapping("/greet/{name}")
    public String greet ( @PathVariable String name ) {
        return "Hello , " + name + "!";
    }
    @GetMapping ("/square/{num}")
    public String square ( @PathVariable int num ) {
        return " The square of " + num + " is " + ( num * num ) + ".";
    }
    @GetMapping("/double/{num}")
    public String double1(@PathVariable int num){
        return " The double of " + num + " is " + ( 2 * num ) + ".";
    }
    @GetMapping("/length/{st}")
    public String length(@PathVariable String st){
        return " The length of " + st + " is " + st.length() + ".";
    }
    @GetMapping("/reverse/{st}")
    public String reverse(@PathVariable String st){
        String reversed = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reversed += st.charAt(i);
        }
        return "Reverse of " + st + " is " + reversed;
    }
    @GetMapping("/concat/{a}/{b}")
    public String concat(@PathVariable String a, @PathVariable String b){
        String concat = a + b;
        return "concat is " + concat;
    }
}
