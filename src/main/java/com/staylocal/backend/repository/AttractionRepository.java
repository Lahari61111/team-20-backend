package com.staylocal.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.staylocal.backend.entity.Attraction;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
}
