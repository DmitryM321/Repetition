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
    }
}

