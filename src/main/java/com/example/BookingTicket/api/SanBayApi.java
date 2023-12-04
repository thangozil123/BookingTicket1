package com.example.BookingTicket.api;

import com.example.BookingTicket.entity.SanBay;
import com.example.BookingTicket.service.SanBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/sanbay")
public class SanBayApi {
    @Autowired
    private SanBayService sanBayService;
    @PostMapping
    public SanBay create(@RequestBody SanBay sanBay) {return sanBayService.create(sanBay); }

    @GetMapping("/{id}")
    public SanBay getThuocById(@PathVariable Long id){
        return sanBayService.getSanBayById(id);
    }

    @GetMapping
    public SanBay getSanBayByMaNV(@RequestParam(name = "maSB") String maNV){
        return sanBayService.getSanBayByMa(maNV);
    }

    @PutMapping("/{id}")
    public SanBay update(@PathVariable Long id,@RequestBody SanBay sanBay){
        return sanBayService.update(id,sanBay);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        sanBayService.delete(id);
    }
//  Lấy DS các chuyến bay
    @GetMapping("/all")
    public List<SanBay> getFindAll(){
        return sanBayService.getFindALL();
    }
}
