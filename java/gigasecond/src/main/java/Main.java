import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Gigasecond gigasecond = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));

        gigasecond.getDateTime();
    }

}
