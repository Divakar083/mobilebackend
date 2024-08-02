package com.example.mobilebackend.controller;

import com.example.mobilebackend.entity.Databooster;
import com.example.mobilebackend.service.DataboosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataboosterController {

    @Autowired
    private DataboosterService databoosterService;

    @GetMapping("/databooster")
    public List<Databooster> getDatabooster() {
        return databoosterService.getAllDatabooster();
    }
}
