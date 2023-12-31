package com.example.BookingTicket.service;

import com.example.BookingTicket.entity.SanBay;
import com.example.BookingTicket.repository.SanBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SanBayService {
    @Autowired
    private SanBayRepository sanBayRepository;
//  Thêm sân bay
    public SanBay create(SanBay sanBay) {
        return sanBayRepository.save(sanBay);
    }
//  Get sân bay
    public SanBay getSanBayById(Long id){
        return sanBayRepository.findById(id).get();
    }
//  Tìm kiếm sân bay
    public SanBay getSanBayByMa(String maSB){
        Optional<SanBay> oSanBay = sanBayRepository.findByMaSB(maSB);
        if(oSanBay.isPresent()) return oSanBay.get();
        else return null;
    }
//  Cập nhật sân bay
    public SanBay update(Long id,SanBay sanBay){
        sanBay.setId(id);
        return sanBayRepository.save(sanBay);
    }
//  Xóa sân bay
    @Transactional
    public void delete(Long id){
        sanBayRepository.deleteById(id);
    }

    public List<SanBay> getFindALL(){
        return sanBayRepository.findAll();
    }
}
