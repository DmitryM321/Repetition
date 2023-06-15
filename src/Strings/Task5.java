package Strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String help = sc.nextLine();
        int count = sc.nextInt();
        System.out.println("Привет, " + name + " ! Это твой помощник " + help + ". " +
                "\nУ тебя " + count + " новых писем.");
    }
}
