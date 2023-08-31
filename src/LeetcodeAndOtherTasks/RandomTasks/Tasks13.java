 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
   import java.util.List;
import java.util.Map;
import java.util.Set; 
import java.util.stream.Collectors;

public class Tasks13 {
    
    public static void main(String[] args) { 
        // 1 Удаление дубликатов из списка
        System.out.println("1 Delete dodbles");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
System.out.println(numbers);
        List<Integer> uniqum = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqum);
             Set<Integer> uniqum2 = new HashSet<>(numbers);
           numbers.clear();
           numbers.addAll(uniqum2);
   
           System.out.println(uniqum2);
     List<String> names = List.of("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice");
        Map<String, Integer> frequencyMap = new HashMap<>();
      for (String name : names) {
               frequencyMap.put(name, frequencyMap.getOrDefault(name, 0) + 1);
           }
        System.out.println(frequencyMap);

           List<Integer> list1 = List.of(1, 2, 3);
           List<Integer> list2 = List.of(3, 4, 5);
         //  list1.addAll(list2);
            Set<Integer> list3 = new HashSet<>(list1);
           list3.addAll(list2);
           System.out.println(list3);
// Упорядочивание списка по убыванию
List<Integer> numbers4 = new ArrayList<>();
numbers4.add(5);
numbers4.add(2);
numbers4.add(9);
numbers4.add(1);
numbers4.add(7);

List<Integer> numbersSort = numbers4.stream()
        .sorted((n1, n2) -> n2.compareTo(n1))
        .collect(Collectors.toList());
          System.out.println(numbersSort);

      Collections.sort(numbers4, Collections.reverseOrder());
           System.out.println( numbers4);
    }
}
