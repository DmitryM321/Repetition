package Lambda;

import java.util.function.Predicate;

public class labmdas {
    public static void main(String[] args) {
        int a = 5;
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

    }
}
