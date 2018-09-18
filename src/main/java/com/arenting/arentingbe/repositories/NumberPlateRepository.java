package com.arenting.arentingbe.repositories;

import com.arenting.arentingbe.entities.NumberPlate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NumberPlateRepository extends JpaRepository<NumberPlate, Long> {
    List<NumberPlate> findByCarModel(String model);
}
