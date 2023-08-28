package LeetcodeAndOtherTasks.RandomTasks;

import java.util.Arrays;

public class Task8 {
     public static void main(String[] args) {

//    Сумма элементов: Напишите программу, которая находит сумму всех элементов в целочисленном массиве.
       int[] m = {1,2,6,8,13,19};
       int b = 0;
       for (int i = 0; i < m.length; i++) {
           b=b+m[i];
       }
       System.out.println(b);
   

// Наибольший элемент: Напишите функцию, которая находит наибольший элемент в массиве целых чисел.
        // Решение №1
       int[] m1 = {1,2,6,8,25,19};
       Arrays.stream(m1).max().ifPresent(max -> System.out.println(max));
        // Решени №2
        System.out.println("33333333");
       int[] m2 = {1,2,6,8,25,19};
       int max1 =Integer.MIN_VALUE;
       for (int i = 0; i < m2.length; i++) {
           if (max1 < m2[i]) {
               max1 = m2[i];
           }
       }
       System.out.println(max1);
//        Обратный порядок: Напишите программу, которая инвертирует порядок элементов в массиве.
//        Например, если у вас есть массив [1, 2, 3, 4], программа должна вернуть [4, 3, 2, 1].
        int[] m3 = {1,7,6,8,25,19};
        int[] n = new int[6];
        int v =0;
        for (int i = m.length - 1, j = 0; i >= 0; i--, j++) {
                v= m[i];
                n[j]=v;
            }
        System.out.println(Arrays.toString(n));
    }
    }

