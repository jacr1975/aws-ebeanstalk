package com.example.awsebeanstalk.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    String return1(){
        return "Hello World";
    }
}