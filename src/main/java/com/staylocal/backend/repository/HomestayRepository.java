package com.staylocal.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.staylocal.backend.entity.Homestay;

public interface HomestayRepository extends JpaRepository<Homestay, Long> {
}