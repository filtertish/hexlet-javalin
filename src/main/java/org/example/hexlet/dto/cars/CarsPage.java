package org.example.hexlet.dto.cars;

import org.example.hexlet.model.Car;

import java.util.List;

public record CarsPage(List<Car> cars) {
}
