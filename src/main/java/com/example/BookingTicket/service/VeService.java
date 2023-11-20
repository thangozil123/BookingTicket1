package com.example.BookingTicket.service;

import com.example.BookingTicket.entity.SanBay;
import com.example.BookingTicket.entity.Ve;
import com.example.BookingTicket.repository.SanBayRepository;
import com.example.BookingTicket.repository.VeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeService {
    @Autowired
    private VeRepository veRepository;
    @Autowired
    private SanBayRepository sanBayRepository;

    public Ve create (Ve ve) {
        SanBay sanBay = sanBayRepository.findById(ve.getNoiDi().getId()).get();
        SanBay sanBay1 = sanBayRepository.findById(ve.getNoiDen().getId()).get();

        ve.setNoiDi(sanBay);
        ve.setNoiDen(sanBay1);

        veRepository.save(ve);
        return ve;
    }
}
