import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        dateTime = moment.atStartOfDay();
    }

    Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    LocalDateTime getDateTime() {
        return dateTime.plusSeconds(1000000000);
    }
}
