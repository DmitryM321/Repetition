package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class labmdas {
    public static void main(String[] args) {
        int a = 5;
        String f = "Pit";
        System.out.println("Задание 1. Является ли число положительным. Реализовать через анонимный класс через лямбду");
        Predicate<Integer> b = new Predicate<Integer>() {
            @Override
            public boolean test(Integer b) {
                return b >= 0;
            }
        };
        System.out.println(b.test(a));
        Predicate<Integer> b1 = c -> c >= 0;
        System.out.println(b1.test(a));
        Consumer<String> greetingConsumer1 = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Привет, " + name + "!");
            }
        };
        greetingConsumer1.accept("Tit");
        Consumer<String> greetingConsumer2 = name -> System.out.println("Привет, " + name + "!");
        greetingConsumer2.accept("Pit");
        Function<Double, Long> number = new Function<Double, Long>() {
            @Override
            public Long apply(Double number) {
                return Math.round(number);
            }
        };
        System.out.println(number.apply(2.2));
        Function<Double, Long> number12 = number1 -> Math.round(number1);
        System.out.println(number12.apply(3.3));
    }
}



