package com.arenting.arentingbe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NumberPlate {

    @Id
    @GeneratedValue(generator = "number_plate_gen_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "number_plate_gen_seq", sequenceName = "number_plate_seq", allocationSize = 1)
    private Long id;
    private String numberPlateValue;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Car car;

}
