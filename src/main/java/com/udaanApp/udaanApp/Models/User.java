package com.udaanApp.udaanApp.Models;

public class User {
    private Integer userId;
    private String name;
    private String drivingLicenceId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicenceId() {
        return drivingLicenceId;
    }

    public void setDrivingLicenceId(String drivingLicenceId) {
        this.drivingLicenceId = drivingLicenceId;
    }

    public User(Integer userId, String name, String drivingLicenceId) {
        this.userId = userId;
        this.name = name;
        this.drivingLicenceId = drivingLicenceId;
    }
}
