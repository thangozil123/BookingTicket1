package com.example.BookingTicket.repository;

import com.example.BookingTicket.entity.HangGhe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
@EnableJpaRepositories
public interface HangGheRepository extends JpaRepository<HangGhe, Long> {
}
