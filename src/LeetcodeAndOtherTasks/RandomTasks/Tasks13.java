 import java.util.ArrayList;
   import java.util.HashSet;
   import java.util.List;
   import java.util.Set;
import java.util.stream.Collector;
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
            
    
    
    }
}
