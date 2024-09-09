package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("Grade.BASIC.getClass() = " + BASIC.getClass());
        System.out.println("Grade.GOLD.getClass() = " + GOLD.getClass());
        System.out.println("Grade.DIAMOND.getClass() = " + DIAMOND.getClass());

        System.out.println("refValue(Grade.BASIC) = " + refValue(BASIC));
        System.out.println("refValue(Grade.GOLD) = " + refValue(GOLD));
        System.out.println("refValue(Grade.DIAMOND) = " + refValue(DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }

}
