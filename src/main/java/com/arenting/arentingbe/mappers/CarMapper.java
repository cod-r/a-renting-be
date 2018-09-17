package com.arenting.arentingbe.mappers;

import com.arenting.arentingbe.entities.Car;
import com.arenting.arentingbe.models.CarModel;

public class CarMapper {
    private CarMapper(){

    }

    public static CarModel toModel(final Car car) {
        return CarModel.builder()
                .id(car.getId())
                .model(car.getModel())
                .availability(car.getAvailability())
                .doorNumber(car.getDoorNumber())
                .fuelType(car.getFuelType())
                .numberPlate(car.getNumberPlate())
                .transmission(car.getTransmission())
                .seats(car.getSeats())
                .pricePerHour(car.getPricePerHour())
                .build();
    }

    public static Car toEntity(final CarModel carModel) {
        return Car.builder()
                .model(carModel.getModel())
                .availability(carModel.getAvailability())
                .doorNumber(carModel.getDoorNumber())
                .fuelType(carModel.getFuelType())
                .numberPlate(carModel.getNumberPlate())
                .transmission(carModel.getTransmission())
                .seats(carModel.getSeats())
                .pricePerHour(carModel.getPricePerHour())
                .build();
    }
}
