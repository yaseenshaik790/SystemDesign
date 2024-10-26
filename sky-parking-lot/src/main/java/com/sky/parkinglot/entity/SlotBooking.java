package com.sky.parkinglot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SLOT_BOOKING")
public class SlotBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "slot_id", referencedColumnName = "slotId")
    private Slot slot;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id", referencedColumnName = "carID")
    private Car car;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receipt_id", referencedColumnName = "receiptId")
    private Receipt receipt;

}
