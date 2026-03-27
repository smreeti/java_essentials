package parkinglot;

public class LargeParkingSpot extends ParkingSpot {
    public LargeParkingSpot(int id) {
        super(id);
    }

    @Override
    boolean canFitVehicle(Vehicle vehicle) {
        return true;
    }
}
