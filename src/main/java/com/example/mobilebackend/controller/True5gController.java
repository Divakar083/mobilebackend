package com.example.mobilebackend.controller;

import com.example.mobilebackend.entity.True5g;
import com.example.mobilebackend.service.True5gService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class True5gController {

    @Autowired
    private True5gService true5gService;

    @GetMapping("/true5g")
    public List<True5g> getTrue5g() {
        return true5gService.getAllTrue5g();
    }
}
