package com.staylocal.backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.staylocal.backend.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);
    List<Booking> findByHostId(Long hostId);
}