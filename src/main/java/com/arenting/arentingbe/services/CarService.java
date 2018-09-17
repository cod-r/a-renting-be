package com.arenting.arentingbe.services;

import com.arenting.arentingbe.entities.Car;
import com.arenting.arentingbe.mappers.CarMapper;
import com.arenting.arentingbe.models.CarModel;
import com.arenting.arentingbe.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = Objects.requireNonNull(carRepository, "carRepository should not be null");
    }

    public List<CarModel> getAllCars() {
        List<Car> carList = carRepository.findAll();
        return carList.stream()
                .map(CarMapper::toModel)
                .collect(Collectors.toList());
    }
}
