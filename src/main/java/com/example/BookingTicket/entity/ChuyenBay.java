package com.example.BookingTicket.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="chuyenbay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBay implements Serializable {
    @Id
//    @Column(name="id", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="noidi"
//            ,insertable = false, updatable = false
    )
    private SanBay noiDi;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="noiden")
    private SanBay noiDen;

    @Column(name = "hanghangkhong")
    private String hangHangKhong;


    @Column(name="giodi")
    private String gioDi;

    @Column(name="gioden")
    private String gioDen;

    @Column(name="giave")
    private long giaVe;
}
