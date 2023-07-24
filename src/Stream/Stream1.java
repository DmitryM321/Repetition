package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 2, 8, 3, 444);
        System.out.println("Задание 1");
        findMinMax(numbers.stream(), Integer::compareTo, (min, max) -> {
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        });
        System.out.println("Задание 2");
        finMEven(numbers);
    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> elements = stream.collect(Collectors.toList());
        if (!elements.isEmpty()) {
            T min = elements.stream().min(order).get();
            T max = elements.stream().max(order).get();
            minMaxConsumer.accept(min, max);
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
    public static void finMEven(List<Integer> numbers) {
        System.out.println("Четных " + numbers.stream().filter(i -> i %2 == 0).count());
    }
    }
