package com.example.mobilebackend.service;

import com.example.mobilebackend.entity.Annual;
import com.example.mobilebackend.repository.AnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualService {
    @Autowired
    private AnnualRepository annualRepository;

    public List<Annual> getAllAnnual() {
        return annualRepository.findAll();
    }
}