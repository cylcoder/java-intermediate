package lang.object.tostring;

public class ObjectPrinter {

    public static void print(Object object) {
        String string = object.toString();
        System.out.println("string = " + string);
    }

}
