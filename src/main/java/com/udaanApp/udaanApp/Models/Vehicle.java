package com.udaanApp.udaanApp.Models;

public class Vehicle {
    private Integer vehicleId;
    private Integer userId;
    private String numberPlateId;

    public Vehicle(int vehicleId, int userId, String numberPlateId) {
        this.vehicleId = vehicleId;
        this.userId = userId;
        this.numberPlateId = numberPlateId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String  getNumberPlateId() {
        return numberPlateId;
    }

    public void setNumberPlateId(String numberPlateId) {
        this.numberPlateId = numberPlateId;
    }
}
