package com.staylocal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.staylocal.backend.entity.Attraction;
import com.staylocal.backend.service.AttractionService;

@RestController
@RequestMapping("/api/places")
public class AttractionController {

    @Autowired
    private AttractionService attractionService;

    @GetMapping
    public List<Attraction> getAllAttractions() {
        return attractionService.getAllAttractions();
    }

    @PostMapping
    public Attraction createAttraction(@RequestBody Attraction attraction) {
        return attractionService.saveAttraction(attraction);
    }
}