package com.staylocal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staylocal.backend.entity.Homestay;
import com.staylocal.backend.repository.HomestayRepository;

@Service
public class HomestayService {

    @Autowired
    private HomestayRepository homestayRepository;

    public List<Homestay> getAllHomestays() {
        return homestayRepository.findAll();
    }

    public Homestay getHomestayById(Long id) {
        return homestayRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Homestay not found"));
    }

    public Homestay saveHomestay(Homestay homestay) {
        return homestayRepository.save(homestay);
    }
}