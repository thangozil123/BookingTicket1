package com.example.BookingTicket.service;

import com.example.BookingTicket.entity.HangGhe;
import com.example.BookingTicket.repository.HangGheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HangGheService {
    @Autowired
    private HangGheRepository hangGheRepository;

    public HangGhe create(HangGhe hangGhe) {return hangGheRepository.save(hangGhe);}

    public List<HangGhe> getFindAll() {return hangGheRepository.findAll();}
}
