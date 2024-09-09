package enumeration.ref3;

import enumeration.ref3.Grade;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }

}
