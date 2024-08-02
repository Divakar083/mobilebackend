package com.example.mobilebackend.service;

import com.example.mobilebackend.entity.Databooster;
import com.example.mobilebackend.repository.DataboosterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataboosterService {
    @Autowired
    private DataboosterRepository databoosterRepository;

    public List<Databooster> getAllDatabooster() {
        return databoosterRepository.findAll();
    }
}