package com.example.regionkommune2v1.repository;

import com.example.regionkommune2v1.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, String> {
}
