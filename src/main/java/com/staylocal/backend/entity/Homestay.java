package com.staylocal.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "homestays")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Homestay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private Double price;
    private Double rating;
    private Integer maxGuests;
    private String host;
    private String image;
    
    @Column(length = 2000)
    private String description;

    private String amenities; // comma separated
}