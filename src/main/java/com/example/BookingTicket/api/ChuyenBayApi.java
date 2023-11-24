package com.example.BookingTicket.api;


import com.example.BookingTicket.entity.ChuyenBay;

import com.example.BookingTicket.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayApi {
    @Autowired
    private ChuyenBayService chuyenBayService;

    @PostMapping
    public  ChuyenBay create(@RequestBody ChuyenBay chuyenBay) { return chuyenBayService.create(chuyenBay); }

//  sửa chuyến bay
    @PutMapping("/{id}")
    public void updateChuyenBay(@PathVariable Long id,@RequestBody ChuyenBay chuyenBay){
        chuyenBayService.updateChuyenBay(id,chuyenBay);
    }
}
