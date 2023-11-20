package com.example.BookingTicket.api;

import com.example.BookingTicket.entity.HangGhe;
import com.example.BookingTicket.service.HangGheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hangghe")
public class HangGheApi {
    @Autowired
    private HangGheService hangGheService;
    @PostMapping
    public HangGhe create(HangGhe hangGhe) {return hangGheService.create(hangGhe);}

    @GetMapping("/all")
    public List<HangGhe> getFindAll(){return hangGheService.getFindAll();}
}
