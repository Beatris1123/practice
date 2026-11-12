package com.example.practice1.Api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {

    @GetMapping("/api/hello")
    public String hello() {
        return "hello";

    }


}
