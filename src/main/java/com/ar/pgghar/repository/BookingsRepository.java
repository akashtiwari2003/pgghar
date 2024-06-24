package com.ar.pgghar.repository;

import com.ar.pgghar.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingsRepository extends JpaRepository<Bookings, Integer> {
}
