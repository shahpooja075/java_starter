package com.udaanApp.udaanApp.Models;

public class Car extends Vehicle{
    private String carName;
    private int numberOfSeats;
    private String type;

    public Car(int vehicleId, int userId, String numberPlateId, String carName, int numberOfSeats, String type) {
        super(vehicleId, userId, numberPlateId);
        this.carName = carName;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
