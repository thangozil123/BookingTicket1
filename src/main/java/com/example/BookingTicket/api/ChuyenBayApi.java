package com.example.BookingTicket.api;


import com.example.BookingTicket.entity.ChuyenBay;

import com.example.BookingTicket.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayApi {
    @Autowired
    private ChuyenBayService chuyenBayService;
    @PostMapping
    public  ChuyenBay create(@RequestBody ChuyenBay chuyenBay) { return chuyenBayService.create(chuyenBay); }
}
