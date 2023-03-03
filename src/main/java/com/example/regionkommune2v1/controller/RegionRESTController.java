package com.example.regionkommune2v1.controller;

import com.example.regionkommune2v1.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.regionkommune2v1.model.Region;
import java.util.List;

@RestController
@CrossOrigin
public class RegionRESTController {

    @Autowired
    RegionRepository regionRepository;

    @GetMapping("/regioner")
    public List<Region> regioner() {
        return regionRepository.findAll();
    }

    @PostMapping("/region")
    @ResponseStatus(HttpStatus.CREATED)
    public Region postRegion(@RequestBody Region region) {
        System.out.println(region);
        return regionRepository.save(region);
    }

}
