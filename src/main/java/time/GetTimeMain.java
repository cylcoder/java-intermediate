package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import static java.time.temporal.ChronoField.*;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + dt.get(YEAR));
        System.out.println("MONTH_OF_YEAR = " + dt.get(MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = " + dt.get(DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + dt.get(HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + dt.get(MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE = " + dt.get(SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dt.get(SECOND_OF_DAY));
    }

}
