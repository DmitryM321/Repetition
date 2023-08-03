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
yourapp the quick brown fox jumps over the lazy dog  */
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
   // ArrayList words = new ArrayList<>(text.split(" "));
    String[] words = text.split(" ");

    List<String> list = Arrays.asList(words);

    Map<String, Integer> frequency = list.stream().collect(Collectors.toMap(null, null, null));
         
    System.out.println(frequency);
    // System.out.println("В тексте " + words.length + " слов");
    // for (String word : words) {
    //     if(!word.equals(word)){
            
    //     }
    //     System.out.println(word);
    // }

    // scanner.close();
 }
}