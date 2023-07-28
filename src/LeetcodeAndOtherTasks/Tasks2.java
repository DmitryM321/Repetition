package LeetcodeAndOtherTasks;

import java.util.*;

public class Tasks2 {
    public static void main(String[] args) {
// Напишите программу, которая берет строку в качестве входных данных и
// выводит на экран количество повторений каждого символа в этой строке.
        String str = "Hello, World!";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);
        System.out.println("___________________________");
        // Напишите программу, которая создает Map со строковыми ключами и целочисленными
// значениями. Затем отсортируйте эту Map по значению в порядке возрастания и выведите результат.
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 20);
        map.put("Python", 10);
        map.put("C++", 5);
        map.put("JavaScript", 30);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);
// Напишите программу, которая объединяет две Map, то есть добавляет все элементы одной Map в другую Map.
// Если ключи уже существуют в целевой Map, значения заменяются.
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 20);
        map1.put("Python", 10);
        System.out.println("3.1______________________________________");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C++", 5);
        map2.put("JavaScript", 30);

        map1.putAll(map2);
        System.out.println(map1);
        System.out.println("3.2______________________________________");
        Map<String, Integer> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);

        System.out.println(mergedMap);
    }
}
