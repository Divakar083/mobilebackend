package com.example.mobilebackend.controller;

import com.example.mobilebackend.entity.Popular;
import com.example.mobilebackend.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PopularController {

    @Autowired
    private PopularService popularService;

    @GetMapping("/popular")
    public List<Popular> getPopular() {
        return popularService.getAllPopular();
    }
}
