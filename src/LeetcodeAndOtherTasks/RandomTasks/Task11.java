package LeetcodeAndOtherTasks.RandomTasks;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task11 {
public static void main(String[] args) {
    //   массив чисел и находит минимальное и максимальное значение. Вывести найденные значения на экран.
    int[] arr = {10, 5, 8, 3, 12};
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] < min){
        min = arr[i]; }
        if(arr[i] > max){
        max = arr[i];
    }}
    System.out.println(max + " " + min);
// на вход строка и находит сумму его цифр
String number = "12345";
char[] numb = number.toCharArray();
int sum = 0;
for (int i = 0; i < numb.length; i++) {
    sum  = sum + Character.getNumericValue(numb[i]);
}
System.out.println(sum);

String number2 = "12345"; 
int sum2 = 0;
for (int i = 0; i < number2.length(); i++) {
    sum2  = sum2 + Character.getNumericValue(number.charAt(i));
}
System.out.println(sum2);
//  Найти все четные числа в списке и вернуть новый список, содержащий только эти числа.
List<Integer> numbers = Arrays.asList(0, -2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> numbers2 = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
System.out.println(numbers2);
//  Найти наименьшее число в списке.
int minNumber = numbers.stream()
        .min(Integer::compareTo) //  метод `min`, который принимает компаратор, для нахождения наименьшего элемента в потоке. Здесь `Integer::compareTo` является компаратором, который сравнивает два числа типа `Integer`
        .orElseThrow(NoSuchElementException::new);  // если поток пустой, то выбрасывается исключение 
System.out.println(minNumber);
//  Преобразовать список строк в список их длин.
List<String> strings = Arrays.asList("apple", "orange", "banana", "kiwi");

List<Integer> lengths = strings.stream()
     //   .map(String::length)  // s -> s.length()
        .map(s -> s.length())
        .collect(Collectors.toList()); 
System.out.println(lengths);
// сгруппировать список людей по их возрасту
List<Map.Entry<Integer, String>> people = Arrays.asList( //чтобы создать список, где каждый элемент является объектом `Map.Entry<Integer, String>
        new AbstractMap.SimpleEntry<>(25, "Alice"),//Map.Entry`, представляющего пару "возраст 25" и "имя Alice
        new AbstractMap.SimpleEntry<>(30, "Bob"),//AbstractMap.SimpleEntry` - простую реализацию 
        new AbstractMap.SimpleEntry<>(25, "Charlie"),// интерфейса `Map.Entry`.
        new AbstractMap.SimpleEntry<>(30, "David"),
        new AbstractMap.SimpleEntry<>(25, "Eve")
);
Map<Integer, List<String>> peopleByAge = people.stream()
        .collect(Collectors.groupingBy(
              //  Map.Entry::getKey, // entry -> entry.getKey()
              entry -> entry.getKey(), //  принимает объект `Map.Entry` и возвращает его ключ.
             //   Collectors.mapping(Map.Entry::getValue, Collectors.toList())
           Collectors.mapping(entry -> entry.getValue(), Collectors.toList())
        ));

System.out.println(peopleByAge); //`Map`, где `25` и `30` являются ключами, 
                //а `[Alice, Charlie, Eve]` и `[Bob, David]` - значениями, соответствующими этим ключам.


}

}