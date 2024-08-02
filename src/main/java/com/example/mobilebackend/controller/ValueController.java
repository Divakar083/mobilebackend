package com.example.mobilebackend.controller;

import com.example.mobilebackend.entity.Value;
import com.example.mobilebackend.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueController {

    @Autowired
    private ValueService valueService;

    @GetMapping("/value")
    public List<Value> getValue() {
        return valueService.getAllValue();
    }
}
