package com.arenting.arentingbe.controllers;

import com.arenting.arentingbe.models.CarModel;
import com.arenting.arentingbe.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarModel> getAllCars() {
        return carService.getAllCars();
    }
}
