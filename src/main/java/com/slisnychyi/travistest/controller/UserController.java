package com.slisnychyi.travistest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String getName() {
        return "my name";
    }
    public void test(){

    }
}
