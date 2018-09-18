package com.arenting.arentingbe.services;

import com.arenting.arentingbe.entities.NumberPlate;
import com.arenting.arentingbe.mappers.NumberPlateMapper;
import com.arenting.arentingbe.models.NumberPlateModel;
import com.arenting.arentingbe.repositories.NumberPlateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class NumberPlateService {

    private final NumberPlateRepository numberPlateRepository;

    public NumberPlateService(NumberPlateRepository numberPlateRepository) {
        this.numberPlateRepository = Objects.requireNonNull(numberPlateRepository,
                "numberPlateRepository should not be null");
    }

    public List<NumberPlateModel> getNumberPlatesByCarModel() {
        List<NumberPlate> numberPlateList = numberPlateRepository.findByCarModel("Skoda Rapid");
        return numberPlateList.stream()
                .map(NumberPlateMapper::toModel)
                .collect(Collectors.toList());
    }
}
