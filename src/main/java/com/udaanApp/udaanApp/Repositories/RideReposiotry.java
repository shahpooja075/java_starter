package com.udaanApp.udaanApp.Repositories;

import com.udaanApp.udaanApp.Models.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RideReposiotry {
    static List<Ride> rides ;
    static int rideCount =0;
    static {
        rides = new ArrayList<>();
        rides.add(new Ride("10 PM","11 PM","A","B",1,1,1));
        rideCount++;

    }

    public void saveRide(Ride ride){
        if(ride.getRideId()==null)
           ride.setRideId(++rideCount);
        rides.add(ride);
    }

    public List<Ride> getRidesByLocation(String startLoc,String endLoc){
        List<Ride> rideList = new ArrayList<>();
        for(Ride ride : rides){
            if(ride.getStartLocation().equals(startLoc) && ride.getEndLocation().equals(endLoc)){
                rideList.add(ride);
            }
        }
        return rideList;
    }

}
