package LeetcodeAndOtherTasks;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {     
 //    Найти среднее значение элементов в массиве с плавающей запятой
       double[] m = {1.3, 7.6, 6.4, 8.9, 25.15, 19.18};
       double avg = 0;
       for (int i = 0; i < m.length; i++) {
           avg = avg + m[i];
       }
       System.out.println(avg / Arrays.stream(m).count());
 //    Найти наименьший элемент в массиве целых чисел.
       int[] d = {9, 10, 12, 3, 3, 5};
       int min = Integer.MAX_VALUE;
       for (int i = 0; i < d.length; i++) {
           if (min > d[i]){
               min= d[i];
           }
       }
       System.out.println(min);
   //    Подсчитать количество четных чисел в массиве целых чисел.
       int[] e = {9, 10, 7, 3, 3, 11};
       int count =0;
       for (int i = 0; i < d.length; i++) {
           if (e[i] % 2 == 0){
               count ++;
           }
       }
       System.out.println(count);
       //  Поменять местами два элемента в массиве по их индексам.
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        int index1 = 0;
        int index2 = 6;
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
//    Отсортировать массив целых чисел в порядке возрастания.
    //   Решение 1
       int[] f = {9, 10, 7, 3, 3, 11};
       Arrays.sort(f);
       System.out.println(Arrays.toString(f));
     //  Решение 2
       int[] a = {9, 10, 7, 3, 3, 11};
       selectionSort(a);
       System.out.println(Arrays.toString(a));
    }
   public static void selectionSort(int[] arr) {
       int n = arr.length;
       for (int i = 0; i < n - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           // Обмен значениями
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
   }
}
//    Проверить, содержит ли массив определенное значение (например, число 10).
//        int[] a = {9, 10, 7, 3, 3, 11};
//        int b = 88;
//        System.out.println( number(a,b));
//    }
//    public static boolean number(int[] arr, int f) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == f) {
//                return true;
//            }
//        }
//        return false;
//    }
//    Найти индекс первого вхождения определенного элемента в массиве строк.

//        int[] a = {9, 10, 7, 3, 3, 11};
//        int b = 9;
//        System.out.println( number(a,b));
//    }
//    public static int number(int[] arr, int f) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == f) {
//                return i;
//            }
//        }
//        return 0;
//    }
//        Создать новый массив, в котором будут только уникальные элементы из исходного массива целых чисел.

//
//                int[] array = {1, 2, 3, 4, 5, 1, 2, 3};
//                int[] uniqueArray = getUniqueElementsArray(array);
//
//               System.out.println(Arrays.toString(uniqueArray));
//                }
//                public static int[] getUniqueElementsArray(int[] array) {
//                return Arrays.stream(array).distinct().toArray();
//            }


    
