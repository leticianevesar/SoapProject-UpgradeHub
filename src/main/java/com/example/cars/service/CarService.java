package com.example.cars.service;

import com.example.cars.model.Car;
import com.example.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public static final Map<Integer, Car> cars = new HashMap<>();
    @PostConstruct
    public void initialize() {
        Car chevrolet = new Car();
        chevrolet.setCarId(1);
        chevrolet.setBrand("Chevrolet");
        chevrolet.setPrice(1000);

        Car nissan = new Car();
        nissan.setCarId(2);
        nissan.setBrand("Nissan");
        nissan.setPrice(1300);

        Car peugeot = new Car();
        peugeot.setCarId(3);
        peugeot.setBrand("Peugeot");
        peugeot.setPrice(1400);

        cars.put(chevrolet.getCarId(), chevrolet);
        cars.put(nissan.getCarId(), nissan);
        cars.put(peugeot.getCarId(), peugeot);
    }

    public Car getCars(int carId) {
        System.out.println(carId);
        return cars.get(carId);
    }

    public Car findCarByCarId(int carId) {
        return carRepository.findByCarId(carId);
    }
}
