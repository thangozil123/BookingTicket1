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
//  lấy chuyến bay
    @GetMapping("/{id}")
    public ChuyenBay getChuyenBayById(@PathVariable Long id){
    return chuyenBayService.getChuyenBayById(id);
    }
//  tìm kiếm chuyến bay
    @GetMapping
    public ChuyenBay getChuyenBayByMa(@RequestParam(name = "maCB") String maCB) {return chuyenBayService.getChuyenBayByMa(maCB);}
// Xóa chuyến bay
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        chuyenBayService.delete(id);
}
}
