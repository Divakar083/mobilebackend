package com.example.mobilebackend.service;

import com.example.mobilebackend.entity.True5g;
import com.example.mobilebackend.repository.True5gRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class True5gService {
    @Autowired
    private True5gRepository true5gRepository;

    public List<True5g> getAllTrue5g() {
        return true5gRepository.findAll();
    }
}