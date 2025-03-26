package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Math.pow;

@RestController
public class Task3Controller {
    @GetMapping ("/add/{x}/{y}")
    public String add ( @PathVariable int x , @PathVariable int y ) {
        return " The sum of " + x + " and " + y + " is " + ( x + y ) + ".";
    }
    @GetMapping ("/multiply/{x}/{y}")
    public String multiply ( @PathVariable int x , @PathVariable int y) {
        return " The product of " + x + " and " + y + " is " + ( x * y ) + ".";
    }
    @GetMapping ("/sub/{x}/{y}")
    public String sub ( @PathVariable int x , @PathVariable int y ) {
        return " The sub of " + x + " and " + y + " is " + ( x - y ) + ".";
    }
    @GetMapping ("/div/{x}/{y}")
    public String div ( @PathVariable int x , @PathVariable int y) {
        return " The div of " + x + " and " + y + " is " + ( x / y ) + ".";
    }
    @GetMapping ("/mod/{x}/{y}")
    public String mod ( @PathVariable int x , @PathVariable int y ) {
        return " The modulus of " + x + " and " + y + " is " + ( x % y ) + ".";
    }
    @GetMapping ("/power/{x}/{y}")
    public String power ( @PathVariable int x , @PathVariable int y) {
        int result = (int) pow(x, y);
        return " The power of " + x + " to " + y + " is " + result + ".";
    }

}
