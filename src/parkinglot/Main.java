package parkinglot;

public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.parkingSpots.add(new SmallParkingSpot(1));
        floor1.parkingSpots.add(new MediumParkingSpot(2));
        floor1.parkingSpots.add(new LargeParkingSpot(3));

        lot.floors.add(floor1);

        Vehicle car = new Car("CAR123");

        Vehicle car1 = new Car("CAR1223");
        Vehicle bike = new Bike("BIKE123");

        lot.parkVehicle(car);
        lot.parkVehicle(car);
        lot.parkVehicle(bike);
    }
}