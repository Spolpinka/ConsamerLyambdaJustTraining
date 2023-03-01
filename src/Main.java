import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human ivan = new Human("Ivan");

        Predicate<String> isLengh = x -> x.length() > 5;

        System.out.println(isLengh.test("ровно"));
        System.out.println(isLengh.test("больше"));

    }
}