package com.arenting.arentingbe.models;

import com.arenting.arentingbe.entities.Availability;
import com.arenting.arentingbe.entities.FuelType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarModel {

    private Long id;

    private String model;
    private Integer doorNumber;
    private String transmission;
//    private String numberPlate;
    private Integer seats;
    private float pricePerHour;

    private Availability availability;

    private FuelType fuelType;
}
