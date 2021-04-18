package com.udaanApp.udaanApp.Controllers;

import com.udaanApp.udaanApp.Models.Car;
import com.udaanApp.udaanApp.Models.Ride;
import com.udaanApp.udaanApp.Models.User;
import com.udaanApp.udaanApp.Services.CarService;
import com.udaanApp.udaanApp.Services.RideService;
import com.udaanApp.udaanApp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    CarService carService;


    @PostMapping("user/register")
    public ResponseEntity saveUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("user/car/register")
    public ResponseEntity saveCar(@RequestBody Car car){
        carService.saveCar(car);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/users")
    public ResponseEntity getAllUser()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/cars")
    public ResponseEntity getAllCars()
    {
        return ResponseEntity.ok(carService.getAllCars());
    }


}
