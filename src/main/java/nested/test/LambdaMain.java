package nested.test;

public class LambdaMain {

    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello.hello");
        hello.hello();
    }

}
