package parkinglot;

abstract class ParkingSpot {
    int id;

    private Vehicle vehicle;
    boolean isOccupied;

    public ParkingSpot(int id) {
        this.id = id;
        this.isOccupied = false;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        this.isOccupied = false;
    }

    abstract boolean canFitVehicle(Vehicle vehicle);
}
