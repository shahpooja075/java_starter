package com.udaanApp.udaanApp.Services;

import com.udaanApp.udaanApp.Models.Car;
import com.udaanApp.udaanApp.Models.Vehicle;
import com.udaanApp.udaanApp.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public void saveCar(Car car){
        carRepository.saveCar(car);
    }

    public List<Vehicle> getAllCars(){
        return carRepository.getAllCars();
    }
}
