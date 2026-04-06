package com.staylocal.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String userName;

    private Long homestayId;
    private String homestayName;
    private String homestayImage;
    private String location;

    private String startDate;
    private String endDate;
    private Integer guests;
    private Double totalPrice;
    private String status;

    private Long hostId;
}