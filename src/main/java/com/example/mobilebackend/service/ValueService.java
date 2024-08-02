package com.example.mobilebackend.service;

import com.example.mobilebackend.entity.Value;
import com.example.mobilebackend.repository.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueService {
    @Autowired
    private ValueRepository valueRepository;

    public List<Value> getAllValue() {
        return valueRepository.findAll();
    }
}