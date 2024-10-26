package com.sky.parkinglot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SLOT")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slotId")
    private Long slotId;
    @Column(name = "NUMBER")
    private String number;
    @Column(name = "DISTANCE")
    private Double distance;
    @Column(name = "IS_AVAILABLE")
    private boolean isAvailable;
    @OneToOne(mappedBy = "slot")
    private SlotBooking slotBooking;
}
