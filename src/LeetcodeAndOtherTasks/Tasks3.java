package LeetcodeAndOtherTasks;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = scanner.nextLine();
// Перевернуть строку:
        String reversed = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed += a.charAt(i);
        }
        System.out.println(reversed);
// Проверить, является ли строка палиндромом:
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed += a.charAt(i);
    }
        if (a.equalsIgnoreCase(reversed)) {
        System.out.println("Строка является палиндромом.");
    } else {
        System.out.println("Строка не является палиндромом.");
    }
  //      Подсчет количества слов в строке:
        String[] words = a.split("\\s+");
        int count = words.length;
        System.out.println("Количество слов: " + count);
    
    System.out.println("21.08");
 // Задача: Написать программу, которая выводит на экран заданную строку заданное количество раз.
            String message = "Hello, World!";
            int repeatCount = 5;
            for (int i = 0; i < repeatCount; i++) {
                System.out.println(message);
            }
    // Написать программу, которая считает сумму всех чисел от 1 до 100 и выводит ее на экран.
   // int x = 1;
    int sum = 0;
    for(int i =1; i <=100; i++ )   {
        sum = sum +i; 
    }     
    System.out.println(sum);
}
}

