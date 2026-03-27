package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<ParkingFloor> floors;

    public ParkingLot() {
        floors = new ArrayList<>();
    }

    public void parkVehicle(Vehicle v) {
        for (ParkingFloor floor : floors) {
            if (floor.parkVehicle(v)) {
                System.out.println("Vehicle parked");
                return;
            }
        }
        System.out.println("No space available");
    }
}
