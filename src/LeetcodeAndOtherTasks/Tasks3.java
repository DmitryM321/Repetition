package LeetcodeAndOtherTasks;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = scanner.nextLine();
        String reversed = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed += a.charAt(i);
        }
        System.out.println(reversed);
    }
}
