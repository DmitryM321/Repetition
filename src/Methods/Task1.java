package Methods;
import java.util.Scanner;

public class Task1 {
    public static void leapYear(int a) {
            if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) {
                System.out.println(a + " год является високосным");
            } else {
                System.out.println(a + " год не является високосным");
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leapYear(year);
        sc.close();
    }
    }

