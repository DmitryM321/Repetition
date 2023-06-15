package Methods;

import java.time.LocalDate;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int systemType = sc.nextInt();
        int year = sc.nextInt();
        download(systemType, year);
        System.out.println("Task2.1");
        int currentYear = LocalDate.now().getYear();
        download(systemType, currentYear);
    }
    public static void download(int systemType, int year) {
        if (systemType == 0 && year >= 2015) {
            System.out.println("Установите приложениe для iOS по ссылке");
        } else if (systemType == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (systemType == 1 && year >= 2015) {
            System.out.println("Установите приложениe для Android по ссылке");
        } else if (systemType == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}
