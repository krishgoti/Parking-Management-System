import java.math.BigDecimal;
import java.util.List;

public class FareCalculator {
    List<FareStrategy> strategies;

    BigDecimal calculateFare(Ticket ticket){
        BigDecimal f = BigDecimal.ZERO;
        for (FareStrategy i: strategies){
            f=i.calculateFare(ticket,f);
        }
        return f;
    }
}
