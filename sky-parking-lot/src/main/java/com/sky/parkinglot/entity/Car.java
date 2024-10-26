package com.sky.parkinglot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carID")
    private Long carID;
    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;
    @Column(name = "COLOUR")
    private String colour;

    @OneToOne(mappedBy = "car")
    private SlotBooking slotBooking;
}
