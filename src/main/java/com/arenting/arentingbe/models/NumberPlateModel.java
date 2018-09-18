package com.arenting.arentingbe.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NumberPlateModel {

    private Long id;
    private String numberPlateValue;

}
