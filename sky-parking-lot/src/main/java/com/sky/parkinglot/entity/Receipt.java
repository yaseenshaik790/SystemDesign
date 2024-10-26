package com.sky.parkinglot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RECEIPT")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receiptId")
    private Long receiptId;
    @Column(name = "CAR_REG_NUMBER")
    private String carRegistrationNumber;
    @Column(name = "COLOUR")
    private String colour;

    @OneToOne(mappedBy = "receipt")
    private SlotBooking slotBooking;
}
