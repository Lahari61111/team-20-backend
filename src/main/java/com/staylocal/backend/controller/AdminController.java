package com.staylocal.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.staylocal.backend.repository.AttractionRepository;
import com.staylocal.backend.repository.BookingRepository;
import com.staylocal.backend.repository.HomestayRepository;
import com.staylocal.backend.repository.UserRepository;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HomestayRepository homestayRepository;

    @Autowired
    private AttractionRepository attractionRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/stats")
    public Map<String, Object> getStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("totalUsers", userRepository.count());
        stats.put("activeHomestays", homestayRepository.count());
        stats.put("attractions", attractionRepository.count());
        stats.put("totalBookings", bookingRepository.count());
        return stats;
    }
}