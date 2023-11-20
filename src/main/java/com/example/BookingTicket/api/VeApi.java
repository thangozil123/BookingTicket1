package com.example.BookingTicket.api;


import com.example.BookingTicket.entity.Ve;
import com.example.BookingTicket.service.VeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datve")
public class VeApi {
    @Autowired
    private VeService veService;
    @PostMapping
    public Ve create(@RequestBody Ve ve) { return veService.create(ve); }
}
