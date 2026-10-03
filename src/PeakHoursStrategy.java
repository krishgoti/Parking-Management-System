import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PeakHoursStrategy implements FareStrategy{


    boolean check(LocalDateTime t){
        if(t.getHour()>8 && t.getHour()<20){
            return true;
        }
        return false;
    }

    @Override
    public BigDecimal calculateFare(Ticket ticket, BigDecimal inputFare){
        BigDecimal fare=inputFare;
        if(check(ticket.entryTime)){
            fare = fare.add(BigDecimal.valueOf(30));
        }
        return fare;
    }
}
