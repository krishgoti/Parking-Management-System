import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    int ticketId;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    static int id = 1;

    Ticket(Vehicle vehicle,ParkingSpot parkingSpot,LocalDateTime entryTime){
        this.ticketId=id++;
        this.vehicle=vehicle;
        this.parkingSpot=parkingSpot;
        this.entryTime=entryTime;
    }

    BigDecimal calculateParkingDuration(){
        this.exitTime=LocalDateTime.now();
        Duration duration = Duration.between(entryTime, exitTime);

        long minutes = duration.toMinutes();

        double hours = minutes / 60.0;
        return BigDecimal.valueOf(hours);
    }


}
