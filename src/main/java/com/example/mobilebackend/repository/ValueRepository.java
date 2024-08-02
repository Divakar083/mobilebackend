package com.example.mobilebackend.repository;

import com.example.mobilebackend.entity.Value;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueRepository extends JpaRepository<Value, Long> {
}
