package com.staylocal.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "attractions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String category;
    private String image;

    @Column(length = 2000)
    private String description;

    @Column(length = 1000)
    private String guideTip;
}