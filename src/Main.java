import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human ivan = new Human("Ivan");
//Predicate
        Predicate<String> isLenghy = x -> x.length() > 5;
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isLenghy.test("ровно"));
        System.out.println(isLenghy.test("больше"));
        System.out.println("проверяем число 10101");
        System.out.println(isPositive.test(10101));
        System.out.println("проверяем число -100");
        System.out.println(isPositive.test(-100));
//Consumer
        Consumer<String> cons = System.out::println;
        Consumer<String> consL = s -> System.out.println(s);
        System.out.println("пробуем вывести имя Ивана");
        cons.accept(ivan.getName());
        //Function
        DecimalFormat decimalFormat = new DecimalFormat("#");
        Function<Double, Long> func = d -> Long.valueOf(decimalFormat.format(d));
        //пробуем вывести дробь 1324123.99999
        System.out.println("пробуем вывести дробь 1324123.99999");
        System.out.println(func.apply(1324123.99999));



    }
}