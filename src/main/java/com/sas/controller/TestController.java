package com.sas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rohit
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String testMethod() {
        return "test success";
    }
}
