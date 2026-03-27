package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    int floorNumber;
    List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied && spot.canFitVehicle(vehicle)) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
}
