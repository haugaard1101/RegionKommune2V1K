package com.example.regionkommune2v1.repository;

import com.example.regionkommune2v1.model.Kommune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KommuneRepository extends JpaRepository<Kommune, String> {
}
