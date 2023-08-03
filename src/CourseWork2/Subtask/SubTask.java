import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SubTask {
    /*1. Количество слов в тексте.
2. Топ-10 самых часто упоминаемых слов, упорядоченных по количеству упоминаний в
обратном порядке. В случае одинакового количества упоминаний слова должны быть отсортированы по алфавиту.
Input:
yourapp the quick brown fox jumps over the lazy dog  */
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine(); 
    String[] words = text.split(" ");
    System.out.println("Количесто слов в строке " + words.length);
    List<String> list = Arrays.asList(words);
    Map<String, Integer> frequency = list.stream()
    .collect(Collectors.toMap(Function.identity(), e -> 1, Integer::sum));
    System.out.println("Топ-10 самых часто упоминаемых слов:");
    List<Map.Entry<String, Integer>> entries = frequency.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .limit(10)
        .collect(Collectors.toList());
    for(Map.Entry<String, Integer> entry : entries){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

 }
}