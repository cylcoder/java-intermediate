package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".");
        String filename = str.substring(0, index);
        String exeName = str.substring(index);

        System.out.println("filename = " + filename);
        System.out.println("exeName = " + exeName);
    }

}
