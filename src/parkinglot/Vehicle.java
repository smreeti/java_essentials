package parkinglot;

public class Vehicle {

    private String licenseeNumber;

    private VehicleType vehicleType;

    public Vehicle(String licenseeNumber, VehicleType vehicleType) {
        this.licenseeNumber = licenseeNumber;
        this.vehicleType = vehicleType;
    }

    public  VehicleType getVehicleType(){
        return vehicleType;
    }
}
