package com.udaanApp.udaanApp.Controllers;

import com.udaanApp.udaanApp.Models.Ride;
import com.udaanApp.udaanApp.Services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RidesController {
    @Autowired
    RideService rideService;

    @PostMapping("user/rides")
    public ResponseEntity createRide(@RequestBody Ride ride){
        rideService.saveRide(ride);
        return ResponseEntity.ok(ride);
    }

    @GetMapping("/rides/{startLoc}/{endLoc}")
    public ResponseEntity getAllRides(@PathVariable String startLoc, @PathVariable String endLoc){
        List<Ride> AvailableRides = rideService.getAllRides(startLoc,endLoc);
        return ResponseEntity.ok(AvailableRides);
    }
}
