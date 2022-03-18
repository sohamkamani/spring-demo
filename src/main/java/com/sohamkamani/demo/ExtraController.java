package com.sohamkamani.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtraController {
    @GetMapping("/extra")
    public String extraController() {
        return "ok";
    }
}
