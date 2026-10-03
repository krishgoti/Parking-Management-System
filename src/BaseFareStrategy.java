import java.math.BigDecimal;

public class BaseFareStrategy implements FareStrategy{


    @Override
    public BigDecimal calculateFare(Ticket ticket, BigDecimal inputFare){
        BigDecimal fare=inputFare;
        if(ticket.vehicle.getSize()==VehicleSize.SMALL){
            fare = fare.add(BigDecimal.valueOf(10));
        }

        if(ticket.vehicle.getSize()==VehicleSize.MEDIUM){
            fare = fare.add(BigDecimal.valueOf(20));
        }

        if(ticket.vehicle.getSize()==VehicleSize.LARGE){
            fare = fare.add(BigDecimal.valueOf(30));
        }
        return fare;
    }


}
