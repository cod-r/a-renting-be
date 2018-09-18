package com.arenting.arentingbe.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(generator = "car_gen_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "car_gen_seq", sequenceName = "car_seq", allocationSize = 1)
    private Long id;

    private String model;
    private Integer doorNumber;
    private String transmission;
    //private String numberPlate;
    private Integer seats;
    private float pricePerHour;

    @Enumerated(EnumType.STRING)
    private Availability availability;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

}
