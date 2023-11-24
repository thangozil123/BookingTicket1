package com.example.BookingTicket.repository;

import com.example.BookingTicket.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, Long> {
}
