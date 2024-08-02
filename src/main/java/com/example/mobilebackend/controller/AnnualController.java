package com.example.mobilebackend.controller;

import com.example.mobilebackend.entity.Annual;
import com.example.mobilebackend.service.AnnualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnualController {

    @Autowired
    private AnnualService annualService;

    @GetMapping("/annual")
    public List<Annual> getAnnual() {
        return annualService.getAllAnnual();
    }
}
