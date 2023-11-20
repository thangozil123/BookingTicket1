package com.example.BookingTicket.service;

import com.example.BookingTicket.entity.ChuyenBay;
import com.example.BookingTicket.entity.SanBay;
import com.example.BookingTicket.repository.ChuyenBayRepository;
import com.example.BookingTicket.repository.SanBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuyenBayService {
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;
    @Autowired
    private SanBayRepository sanBayRepository;

    public ChuyenBay create(ChuyenBay chuyenBay) {
        SanBay sanBay = sanBayRepository.findById(chuyenBay.getNoiDi().getId()).get();
        SanBay sanBay1 = sanBayRepository.findById(chuyenBay.getNoiDen().getId()).get();

        chuyenBay.setNoiDi(sanBay);
        chuyenBay.setNoiDen(sanBay1);

        chuyenBayRepository.save(chuyenBay);
        return chuyenBay;
    }
}
