package parkinglot;

public class MediumParkingSpot extends ParkingSpot {
    public MediumParkingSpot(int id) {
        super(id);
    }

    @Override
    boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.CAR;
    }
}
