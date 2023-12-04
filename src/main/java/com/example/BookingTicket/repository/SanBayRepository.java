package com.example.BookingTicket.repository;

import com.example.BookingTicket.entity.SanBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface SanBayRepository extends JpaRepository<SanBay, Long> {
    Optional<SanBay>findByMaSB(String maSB);
}
