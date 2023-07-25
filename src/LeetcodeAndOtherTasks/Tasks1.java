package LeetcodeAndOtherTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks1 {
    public static void main(String[] args) {
        //1. Задача: Необходимо создать список целых чисел и вывести все элементы списка на экран.
        System.out.println("1_______________________");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(11);
        System.out.println(numbers);
// 2. Задача: Даны два списка целых чисел. Необходимо объединить их в один список и вывести все элементы объединенного списка на экран.
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        System.out.println("2.1_____________________");
        List<Integer> listAll = new ArrayList<>();
        listAll.addAll(list1);
        listAll.addAll(list2);
        System.out.println(listAll);
        System.out.println("2.2_____________________");
        List<Integer> listAll2 = list1;
        listAll2.addAll(list2);
        System.out.println(listAll2);
        System.out.println("2.3_____________________");
        List<Integer> listAll3 = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listAll3);
        System.out.println("2.4_____________________");

    }
}

