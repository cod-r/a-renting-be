package com.arenting.arentingbe.controllers;

import com.arenting.arentingbe.models.CarModel;
import com.arenting.arentingbe.models.NumberPlateModel;
import com.arenting.arentingbe.services.CarService;
import com.arenting.arentingbe.services.NumberPlateService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;
    private final NumberPlateService numberPlateService;

    public CarController(CarService carService, NumberPlateService numberPlateService) {
        this.carService = carService;
        this.numberPlateService = numberPlateService;
    }

    @CrossOrigin
    @GetMapping
    public List<CarModel> getAllCars() {
        return carService.getAllCars();
    }
    @GetMapping("/test")
    public List<NumberPlateModel> getNumberPlatesByCarModel() {
        return numberPlateService.getNumberPlatesByCarModel();
    }
}
