package Methods;

import java.time.LocalDate;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        System.out.println( "Потребуется дней: " + delivery(distance));
    }
    public static int delivery(int distance) {
        int dayDelivery = 1;
        if (distance <= 20) {
            return dayDelivery;
        } else if (distance >= 20 && distance <= 60 ) {
            return dayDelivery + 1;
        } else if (distance > 60 && distance <= 100) {
            return dayDelivery + 2;
        } else   {
            return dayDelivery + 3;
        }
    }
}
