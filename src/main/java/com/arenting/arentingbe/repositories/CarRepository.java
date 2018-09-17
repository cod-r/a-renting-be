package com.arenting.arentingbe.repositories;

import com.arenting.arentingbe.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}