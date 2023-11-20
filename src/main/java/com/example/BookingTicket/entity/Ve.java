package com.example.BookingTicket.entity;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="ve")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ve implements Serializable {
    @Id
//    @Column(name="veid", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="noidi"
//            , insertable = false, updatable = false
            )
    private SanBay noiDi;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="noiden")
    private SanBay noiDen;

    @Column(name="sohanhkhach", length = 45)
    private int soHanhKhach;

    @Column(name="ngaydi",columnDefinition = "DATE")
    private Date ngayDi;

    @Column(name="ngaykhuhoi",columnDefinition = "DATE")
    private Date ngayKhuHoi;

    @Column(name="hangghe")
    private String hangGhe;
}
