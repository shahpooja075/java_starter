package com.udaanApp.udaanApp.Services;

import com.udaanApp.udaanApp.Models.Ride;
import com.udaanApp.udaanApp.Repositories.RideReposiotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {
    @Autowired
    RideReposiotry rideReposiotry;

    public void saveRide(Ride ride){
        rideReposiotry.saveRide(ride);
    }

    public List<Ride> getAllRides(String startLoc, String endLoc){
       return rideReposiotry.getRidesByLocation(startLoc,endLoc);
    }
}
