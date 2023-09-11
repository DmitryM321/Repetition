package StepikTaskCourse;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class ArithmeticOperations2 {
    public static void main(String[] args) {
    // За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршрут длиной 
    // m километров? Программа получает на вход натуральные числа n и m, не превосходящие 10000.

    //    Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
//     int a = 400;
//     int b = 800;
      
// int result = (b + a - 1) / a;
        
// System.out.println(result);

// n школьников делят k яблок “поровну”, то есть так, чтобы количество яблок,
// доставшихся любым двум школьникам, отличалось бы не более, чем на 1.

 Scanner scanner = new Scanner(System.in);
    // int n = scanner.nextInt();
    // int k = scanner.nextInt();
    int n = 7;
    int k = 30;
    int remainder = (n -  (k%n)); 
    int c2 = (n -  (k%n))%n; 
   System.out.println(remainder);

    System.out.println(c2);
    System.out.println(5%7);


    }
}
