package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (long i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plusWeeks(2 * i);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }
    }

}
