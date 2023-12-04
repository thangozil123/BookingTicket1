package com.example.BookingTicket.service;

import com.example.BookingTicket.entity.ChuyenBay;
import com.example.BookingTicket.entity.SanBay;
import com.example.BookingTicket.repository.ChuyenBayRepository;
import com.example.BookingTicket.repository.SanBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChuyenBayService {
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;
    @Autowired
    private SanBayRepository sanBayRepository;

    public ChuyenBay create(ChuyenBay chuyenBay) {
        SanBay sanBay = sanBayRepository.findById(chuyenBay.getNoiDi().getId()).get();
        chuyenBay.setNoiDi(sanBay);

        SanBay sanBay1 = sanBayRepository.findById(chuyenBay.getNoiDen().getId()).get();
        chuyenBay.setNoiDen(sanBay1);

        chuyenBayRepository.save(chuyenBay);
        return chuyenBay;
    }
// lấy lần khám
    public ChuyenBay getChuyenBayById(Long id){
        Optional<ChuyenBay> oChuyenBay =chuyenBayRepository.findById(id);
        return oChuyenBay.get();
    }
//  sửa chuyến bay
    public ChuyenBay updateChuyenBay(Long id, ChuyenBay chuyenBay){
        ChuyenBay chuyenBayold = chuyenBayRepository.findById(id).get();

        SanBay sanBay = sanBayRepository.findById(chuyenBay.getNoiDi().getId()).get();
        SanBay sanBay1 = sanBayRepository.findById(chuyenBay.getNoiDen().getId()).get();

        chuyenBayold.setNoiDi(sanBay);
        chuyenBayold.setNoiDen(sanBay1);
        chuyenBayold.setNgayBay(chuyenBay.getNgayBay());
        chuyenBayold.setGiaVe(chuyenBay.getGiaVe());
        chuyenBayold.setGioDi(chuyenBay.getGioDi());
        chuyenBayold.setGioDen(chuyenBay.getGioDen());
        chuyenBayold.setHangHangKhong(chuyenBay.getHangHangKhong());
        chuyenBayold.setMaCB(chuyenBay.getMaCB());
        chuyenBayold.setId(id);
        return chuyenBayRepository.save(chuyenBayold);

//        return chuyenBayRepository.save(chuyenBay);
    }
//  Xóa chuyến bay
    public void delete(Long id) {chuyenBayRepository.deleteById(id);}
}
