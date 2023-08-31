import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task14 {
    public static void main(String[] args) {
    //    Найти все уникальные слова в списке строк и вывести их в отсортированном порядке.
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
Set<String> uniqueWords = words.stream()  
        .sorted()
      //  .collect(() -> new TreeSet<>(), (set, word) -> set.add(word), (set1, set2) -> set1.addAll(set2));
        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(uniqueWords);

    //    Подсчитать количество слов в строке.
        String sentence = "This is a sample sentence";
        String[] count = sentence.split(" ");
        System.out.println("Plan A: " + count.length);

              
        int count2 = Arrays.stream(sentence.split(" "))
        .mapToInt(word -> 1)
        .sum();
        System.out.println("Plan B: " + count2);

     //   Отфильтровать список строк, оставив только те, которые начинаются с определенной буквы.
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Emma");
String startingLetter = "C";
List<String> filteredNames = names.stream()
     .filter(n -> n.startsWith(startingLetter))
     // .filter(n -> n.contains("Li"))
   //  .filter(n -> n.equalsIgnoreCase("Bob"))
      .collect(Collectors.toList());
      System.out.println(filteredNames);

      // Объединить несколько списков в один и отсортировать его в порядке убывания.
      List<Integer> list1 = Arrays.asList(3, 1, 4);
      List<Integer> list2 = Arrays.asList(5, 3, 2);
      List<Integer> list3 = Arrays.asList(6,5, 5);
      List<Integer> combinedList = Stream.of(list1, list2, list3)
      .flatMap(list -> list.stream())
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

          System.out.println(combinedList);
// Объединить несколько списков в один и отсортировать его в порядке убывания без повторов!!!!.
Set<Integer> combinedList2 = Stream.of(list1, list2, list3)
      .flatMap(list -> list.stream())
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toSet());

          System.out.println(combinedList2);


}
}