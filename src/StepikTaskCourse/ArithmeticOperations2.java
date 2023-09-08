package StepikTaskCourse;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class ArithmeticOperations2 {
    public static void main(String[] args) {
    // За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршрут длиной 
    // m километров? Программа получает на вход натуральные числа n и m, не превосходящие 10000.

        Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    int a = 400;
    int b = 800;
      int c = ((b - a*(b/a))  + a) /b   ;  
    int d = (b/a)  + c*b/a    ; 
 System.out.println(c); 
System.out.println(d); 
int result = (b + a - 1) / a;
        
System.out.println(result);
    }
}
