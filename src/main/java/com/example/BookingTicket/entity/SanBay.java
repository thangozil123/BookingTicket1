package com.example.BookingTicket.entity;


import lombok.*;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="sanbay")

public class SanBay implements Serializable {
    @Id
//    @Column(name = "id", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tensanbay")
    private String tensanbay;

}
