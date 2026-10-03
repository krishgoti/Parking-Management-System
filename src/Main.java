import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize Parking Manager
        ParkingManager parkingManager = new ParkingManager();
        parkingManager.availableSpots = new HashMap<>();
        parkingManager.vehicleParkingSpotMap = new HashMap<>();

        // Initialize Spots
        List<ParkingSpot> smallSpots = new ArrayList<>();
        smallSpots.add(new CompactSpot(1, null));
        smallSpots.add(new CompactSpot(2, null));

        List<ParkingSpot> mediumSpots = new ArrayList<>();
        mediumSpots.add(new RegularSpot(3, null));
        mediumSpots.add(new RegularSpot(4, null));

        List<ParkingSpot> largeSpots = new ArrayList<>();
        largeSpots.add(new OversizedSpot(5, null));
        largeSpots.add(new OversizedSpot(6, null));

        parkingManager.availableSpots.put(VehicleSize.SMALL, smallSpots);
        parkingManager.availableSpots.put(VehicleSize.MEDIUM, mediumSpots);
        parkingManager.availableSpots.put(VehicleSize.LARGE, largeSpots);

        // Initialize Fare Calculator
        FareCalculator fareCalculator = new FareCalculator();
        fareCalculator.strategies = new ArrayList<>();
        fareCalculator.strategies.add(new BaseFareStrategy());
        fareCalculator.strategies.add(new PeakHoursStrategy());

        // Initialize Parking Lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.parkingManager = parkingManager;
        parkingLot.fareCalculator = fareCalculator;

        // Create Vehicles
        Vehicle car = new Car("CAR-123");
        Vehicle truck = new Truck("TRUCK-456");
        Vehicle motorcycle = new Motorcycle("MOTO-789");

        try {
            // Park Vehicles
            System.out.println("Parking Car...");

            Ticket carTicket = parkingLot.enterVehicle(car);
            System.out.println("Car parked at spot: " + carTicket.parkingSpot.getSpotNumber());

            System.out.println("Parking Truck...");
            Ticket truckTicket = parkingLot.enterVehicle(truck);
            System.out.println("Truck parked at spot: " + truckTicket.parkingSpot.getSpotNumber());

            System.out.println("Parking Motorcycle...");
            Ticket motoTicket = parkingLot.enterVehicle(motorcycle); // Motorcycle is LARGE in this system?
            System.out.println("Motorcycle parked at spot: " + motoTicket.parkingSpot.getSpotNumber());

            // Calculate Fare and Leave
            System.out.println("\nCalculating Fare for Car...");
            BigDecimal carFare = parkingLot.fareCalculator.calculateFare(carTicket);
            System.out.println("Car Fare: " + carFare);
            parkingLot.leaveVehicle(carTicket);
            System.out.println("Car left.");

            System.out.println("\nCalculating Fare for Truck...");
            BigDecimal truckFare = parkingLot.fareCalculator.calculateFare(truckTicket);
            System.out.println("Truck Fare: " + truckFare);
            parkingLot.leaveVehicle(truckTicket);
            System.out.println("Truck left.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
