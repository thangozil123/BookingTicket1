package com.example.BookingTicket.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="hangghe")

public class HangGhe implements Serializable {
    @Id
//    @Column(name = "id", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenhangghe")
    private String tenhangghe;

}