import java.time.LocalDateTime;

public class ParkingLot {

    ParkingManager parkingManager;
    FareCalculator fareCalculator;

    public Ticket enterVehicle(Vehicle vehicle){
        ParkingSpot p = parkingManager.parkVehicle(vehicle);
        if(p==null){
            throw new RuntimeException("Parking is full!!");
        }
        return new Ticket(vehicle,p, LocalDateTime.now());

    }

    public void leaveVehicle(Ticket ticket){
        parkingManager.unpark(ticket.vehicle);
    }
}

