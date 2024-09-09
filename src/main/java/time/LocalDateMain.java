package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1998, 9, 8);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        ofDate = ofDate.plusDays(25);
        System.out.println("지정 날짜 + 25d = " + ofDate);
    }

}
