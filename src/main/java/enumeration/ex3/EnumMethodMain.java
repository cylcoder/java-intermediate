package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("value.name() = " + value.name());
            System.out.println("value.ordinal() = " + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println("grade = " + grade);
    }


}
