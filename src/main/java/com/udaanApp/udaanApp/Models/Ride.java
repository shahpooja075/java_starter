package com.udaanApp.udaanApp.Models;

public class Ride{
    private String startTime;
    private String endTime;
    private String startLocation;
    private String endLocation;
    private Integer userId;
    private Integer carId;
    private Integer rideId;

    public Ride(String startTime, String endTime, String startLocation, String endLocation, Integer userId, Integer carId,Integer rideId) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.userId = userId;
        this.carId = carId;
        this.rideId = rideId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getRideId() {
        return rideId;
    }

    public void setRideId(Integer rideId) {
        this.rideId = rideId;
    }
}
