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

//  Scanner scanner = new Scanner(System.in);
//     // int n = scanner.nextInt();
//     // int k = scanner.nextInt();
//     int n = 7;
//     int k = 30;
//     int remainder = (n -  (k%n)); 
//     int c2 = (n -  (k%n))%n; 
//    System.out.println(remainder);

//     System.out.println(c2);
//     System.out.println(5%7);
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь 
//спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
//Scanner scanner = new Scanner(System.in);
//      int h = scanner.nextInt();
//        int a = scanner.nextInt();
//      int b = scanner.nextInt();


// int h = 100;  // 8 
//   int a = 3;
//     int b = 2;
//     int climbed = a - b;
//     int days = (h - a + climbed - 1) / climbed + 1;

//     System.out.println(days);
    //     Scanner scanner = new Scanner(System.in);
    //     int number = scanner.nextInt();

    // int thousandsPlace = number / 1000;
    // int hundredsPlace = (number / 100) % 10;
    // int tensPlace = (number / 10) % 10;
    // int unitsPlace = number % 10;

    // int sum = (thousandsPlace + unitsPlace) - (hundredsPlace + tensPlace);

    // if (sum == 0) {
    //     System.out.println(1);
    // } else {
    //     System.out.println(0);
//  Scanner scanner = new Scanner(System.in);
// Даны два натуральных числа n и m. Если одно из них делится на другое нацело, выведите 1, иначе выведите 0.
// int a = 28;
// int b = 4;

// int case1 = a % b; // 0   
// int case2 = b % a; // 4
// System.out.println(1 / (case1 * case2 + 1));
// System.out.println(27 % 28);

// int a = 28;
// int b = 4;  
// int result = ((a * (a / b) + b * (b / a)) / (b / a + a / b));       
//        System.out.println(result); 
// int a = 4;
// int b = 5;
// int max;
// if (a > b) {
//     max = a;
// } else {
//     max = b;
// }
// System.out.println(max);
//         Scanner scanner = new Scanner(System.in);
//         int year = scanner.nextInt();
//         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }

int x = 115;
        
        int sign = 0;
        
        if (x > 0) {
            sign = 1;
        } else if (x < 0) {
            sign = -1;
        }
        
        System.out.println( sign);
    }
}


    }
}


    