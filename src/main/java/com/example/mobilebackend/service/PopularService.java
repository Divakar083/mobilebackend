package com.example.mobilebackend.service;

import com.example.mobilebackend.entity.Popular;
import com.example.mobilebackend.repository.PopularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularService {
    @Autowired
    private PopularRepository popularRepository;

    public List<Popular> getAllPopular() {
        return popularRepository.findAll();
    }
}