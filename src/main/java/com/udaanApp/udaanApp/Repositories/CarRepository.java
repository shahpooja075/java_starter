package com.udaanApp.udaanApp.Repositories;

import com.udaanApp.udaanApp.Models.Car;
import com.udaanApp.udaanApp.Models.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
        static List<Vehicle> carList;
        static int carCount =0;
        static {
            carList = new ArrayList<>();
            carList.add(new Car(1,1,"MH-12 HU1212","Honda city",4,"Sedan"));
            carCount++;
        }

    public void saveCar(Car car){
            car.setVehicleId(++carCount);
        carList.add(car);
    }

    public List<Vehicle> getAllCars(){
        return carList;
    }
}
