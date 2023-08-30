import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
       // Найти сумму всех элементов в списке целых чисел. 
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
int sum = numbers.stream().mapToInt(n -> n).sum();
System.out.println(sum);

// Получить список уникальных квадратов всех чисел из исходного списка.
List<Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 4, 4, 5);
List<Integer> uniqueSquare = numbers2.stream()
            .map(n -> n*n)
            .distinct()
            .collect(Collectors.toList());

            System.out.println(uniqueSquare);
 //Проверить, все ли строки в списке содержат только цифры.
List<String> strings = Arrays.asList("123", "abc", "abc4", "789");
boolean allDigits = strings.stream().allMatch(s -> s.matches("\\d"));
System.out.println(allDigits);
//Получить список длин строк из исходного списка строк.
List<String> strings2 = Arrays.asList("apple", "banana", "kiwi");
List<Integer> stringLength = strings2.stream()
        .map(n -> n.length())
        .collect(Collectors.toList());
        System.out.println(stringLength);
// Найти максимальное значение из списка чисел.
List<Integer> numbers3 = Arrays.asList(5, 2, 8, 1, 7);
Optional<Integer> maxValue = numbers3.stream()
        .max((n1, n2)-> n1.compareTo(n2));
        System.out.println(maxValue.orElse(0)); 

int maxValue2 = numbers3.stream()
        .max((n1, n2)-> n1.compareTo(n2)).get();
        System.out.println(maxValue2);
// Повторяющийся элемент в коллекции. Сколько раз повторяется
        List<String> letters = Arrays.asList("a", "b", "a", "c", "d");
        int count = Collections.frequency(letters, "a");
        System.out.println(count);


    }
}
