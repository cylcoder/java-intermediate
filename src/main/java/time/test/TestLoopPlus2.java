package time.test;

import java.time.LocalDate;
import java.time.Period;

public class TestLoopPlus2 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            Period period = Period.ofDays(14);
            System.out.println("날짜 " + (i + 1) + ": " + localDate);
            localDate = localDate.plus(period);
        }
    }

}
