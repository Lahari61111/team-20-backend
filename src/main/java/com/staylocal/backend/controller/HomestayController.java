package com.staylocal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.staylocal.backend.entity.Homestay;
import com.staylocal.backend.service.HomestayService;

@RestController
@RequestMapping("/api/homestays")
public class HomestayController {

    @Autowired
    private HomestayService homestayService;

    @GetMapping
    public List<Homestay> getAllHomestays() {
        return homestayService.getAllHomestays();
    }

    @GetMapping("/{id}")
    public Homestay getHomestayById(@PathVariable Long id) {
        return homestayService.getHomestayById(id);
    }

    @PostMapping
    public Homestay createHomestay(@RequestBody Homestay homestay) {
        return homestayService.saveHomestay(homestay);
    }
}