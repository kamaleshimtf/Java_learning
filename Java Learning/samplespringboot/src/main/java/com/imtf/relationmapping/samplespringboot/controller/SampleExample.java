package com.imtf.relationmapping.samplespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class SampleExample {
    @GetMapping
    public String getEmployee() {
        return "Hello World";
    }

    @PostMapping
    public String postEmployee() {
        return "Hello World post";
    }
}
