package time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus2 {

    public static void main(String[] args) {
        LocalDateTime before = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.ofHours(4);
        LocalDateTime after = before.plus(period).plus(duration);

        System.out.println("기준 시각: " + before);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + after);
    }

}
