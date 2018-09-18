package com.arenting.arentingbe.mappers;

import com.arenting.arentingbe.entities.NumberPlate;
import com.arenting.arentingbe.models.NumberPlateModel;

public class NumberPlateMapper {

    public NumberPlateMapper() {
    }

    public static NumberPlateModel toModel(final NumberPlate numberPlate) {
        return NumberPlateModel.builder()
                .id(numberPlate.getId())
                .numberPlateValue(numberPlate.getNumberPlateValue())
                .build();
    }


}
