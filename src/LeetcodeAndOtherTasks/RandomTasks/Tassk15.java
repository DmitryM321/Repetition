package LeetcodeAndOtherTasks.RandomTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tassk15 {
public static void main(String[] args) {
       // Дано число, требуется определить, содержит ли оно уникальные цифры.
                     // Например, для числа 12345 ответ будет "да", а для числа 12234 - "нет".
    
    int q = 1345;
    String str = String.valueOf(q);
    Set<Character> digits = new HashSet<>();
    for (char s : str.toCharArray()) {
        digits.add(s);
    }
    if(digits.size() == str.length()){
        System.out.println("All Uniq");
    } else {
        System.out.println("Not uniq");
    }
    System.out.println(str);
    //System.out.println(digits);
    // Объединение двух HashSet
Set<Integer> a = new HashSet<>(Arrays.asList(7, 4, 7));
Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 7));
Set<Integer> all = new HashSet<>();
all.addAll(a);
all.addAll(b);
System.out.println(all);
Set<Integer> all2 = new HashSet<>(a);
all2.addAll(b);
System.out.println(all2);
//найти и вывести все элементы, которые присутствуют в обоих множествах. 4!!!!
Set<Integer> interPrinter = new HashSet<>(a);
interPrinter.retainAll(b);
System.out.println(interPrinter);

//  Удаление дубликатов из массива с использованием HashSet
// Дан массив целых чисел, требуется удалить все дубликаты и вернуть новый массив без
// повторяющихся элементов. Например, если у нас есть массив {1, 2, 2, 3, 4, 4, 5}, 
// то после удаления дубликатов получим массив {1, 2, 3, 4, 5}.

int[] mass = {1, 2, 2, 3, 4, 4, 5};
Set<Integer> newMass = new HashSet<>();
for (int integer : mass) { 
        newMass.add(integer);
    }
    System.out.println(newMass);
// int dlina = newMass.size();
// int[] result  = new int[dlina]; 
//         int i = 0;
//         for (Integer s: newMass) {
//             result[i++] = s;
//         }
int[] result = newMass.stream().mapToInt(Integer::intValue).toArray();
int[] result2 = newMass.stream().mapToInt(n -> n).toArray();        
         
        System.out.println(Arrays.toString(result));
          System.out.println(Arrays.toString(result2));

//  Проверка на уникальность элементов коллекции
// Дана коллекция объектов, требуется проверить, содержит ли она только
// уникальные элементы. Например, для коллекции {1, 2, 3, 4} ответ будет "да", - "нет".
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4));
 
Set<Integer> setik = new HashSet<>(list);

if(list.size() == setik.size()){
    System.out.println("true");
} else {
System.out.println("false");
    }
}

}     

 

 