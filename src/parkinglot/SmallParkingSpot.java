package parkinglot;

public class SmallParkingSpot extends ParkingSpot {
    public SmallParkingSpot(int id) {
        super(id);
    }

    @Override
    boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.BIKE;
    }
}
