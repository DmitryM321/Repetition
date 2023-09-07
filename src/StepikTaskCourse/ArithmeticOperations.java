package StepikTaskCourse;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class ArithmeticOperations {

    public static void main(String[] args) {
       // Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
        // int a1 = 6;
        // int b1 = 8;
        // int c1 = (int) Math.sqrt((a1*a1) + (b1*b1));
        // System.out.println(c1);
// считывает целое число и выводит текст, аналогичный приведенному в примере.
// Пробелы, знаки препинания, заглавные и строчные буквы важны179

// Scanner scanner = new Scanner(System.in);
// int a2 = scanner.nextInt();
// int b2 = a2 +1;
// int c2 = a2 - 1;
// System.out.println("The next number for the number " + a2 +" is " + b2 + ".");
// System.out.println("The previous number for the number " + a2 +" is " + c2 + ".");

// Программа получает на вход числа N и K. должна вывести искомое количество яблок.
// Scanner scanner = new Scanner(System.in);
//  int a3 = scanner.nextInt();
//      int b3 = scanner.nextInt();   
//  //    int c3 = b3 - (a3 * (b3 /a3)) ;
//  int c3 = b3%a3 ;

// System.out.println(c3);
//  109 километров. Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час.
// На какой отметке он остановится через t часов?Программа должна вывести целое число 
// от 0 до 108 — номер отметки, на которой остановится Вася.

//  int v = scanner.nextInt();
//  int t = scanner.nextInt();   
// int circle = 109;
// int fin = 0;

// if(v > 0) {
//     fin = (v * t) % circle;
// } else {
//     fin = Math.abs((v * t) % circle);
//     if(fin == 0) {
//         fin = 0;
//     } else {
//         fin = circle - fin;
//     }
// } 
//         System.out.println(fin);
// Scanner scanner = new Scanner(System.in);
// int a4 = 345;
// String b4 = Integer.toString(a4);
// char[] c4 = b4.toCharArray();


//  System.out.println(c4[c4.length-1]);
// Scanner scanner = new Scanner(System.in);
// int number = scanner.nextInt();
// int tens = number / 10;   
// tens = tens % 10;  
// System.out.println(tens);

// Дано трехзначное число (оно может быть отрицательным). Найдите сумму его цифр.
// Scanner scanner = new Scanner(System.in);
// int number = scanner.nextInt();
// int sum = 0;
// int absNumber = Math.abs(number);

// while (absNumber > 0) {
//     int digit = absNumber % 10;  
//     sum += digit; 
//     absNumber /= 10;  
// }

// System.out.println(sum);
// Выведите следующее за ним четное число. При решении этой задачи
// нельзя использовать условную инструкцию if и циклы.
// Scanner scanner = new Scanner(System.in);
// int number = scanner.nextInt();

// int nextEvenNumber = (number / 2 + 1) * 2;

// System.out.println(nextEvenNumber);
// Дано число n. С начала суток прошло n минут. Определите, сколько часов и минут будут показывать 
//электронные часы в этот момент.
// Scanner scanner = new Scanner(System.in);
        
//   int n = scanner.nextInt();
//   int hours = (n / 60) % 24;
//   int minutes = n % 60;
//   System.out.println(hours + " " + minutes);

//  время в формате h:mm:ss, то есть сначала записывается количество часов, потом обязательно
// двузначное количество минут, затем обязательно двузначное количество секунд. 
// C начала суток прошло n секунд. Выведите, что покажут часы.
// c
//         int n = scanner.nextInt();
//         int hours = (n / 3600) % 24;
//         int minutes = (n % 3600) / 60;
//         int seconds = n % 60;
        
//         System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
//  считывает значения двух целочисленных переменных a и b, затем меняет их значения местами
// Scanner scanner = new Scanner(System.in);
//     int a6 = scanner.nextInt();  
//     int b6 = scanner.nextInt();
//     System.out.println(b6 + " " + a6);

//  занятия начинаются в 9:00. Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д.
// уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут. Определите,
// когда заканчивается указанный урок. Входные данные
// Дан номер урока (число от 1 до 10).
// 1 + 5, 2 + 15, 3 + 5, 4 + 15, 5 + 5, 6 + 15, 7 +5 
// Scanner scanner = new Scanner(System.in);
// // int a7 = scanner.nextInt();  
//  int a7 = 3;  
//  int start = 540; // in minuts
//  int hours = 45;
//  int even = 15;
//  int odd = 5;   
//  int fin = 0;
//  if(a7 % 2 ==0){
//   fin = start + (hours*a7) + odd*a7 - (odd*(a7 / 2)) + even*a7 - (even*(a7 /2)) -even ;   
//  } else {
// fin = start + (hours*a7) + odd*a7 - (odd*(a7 / 2)) - odd + even*a7 - (even*(a7 /2)) -even  ;   
//  }
  
// //540 + 45+ + 5 + 45 = 635
// // 540 + 180 = 720 + 10 + 15 = 745
// // 540 + 450 + 25 + 60 = 1075
// // 540 + 135 + 20 = 695
// // 6    540 + 270 + 15 + 30 = 855
//  System.out.println(fin/60 + " " + (fin - (fin/60)*60));

//  Scanner scanner = new Scanner(System.in);

//  int a = scanner.nextInt();
//  int b = scanner.nextInt();
//  int n = scanner.nextInt();

//  int totalCostInKopeks = (a * 100 + b) * n;
//  int rub = totalCostInKopeks / 100;
//  int kop = totalCostInKopeks % 100;

//  System.out.println(rub + " " + kop);
 // Программа на вход получает три целых числа — часы, минуты, секунды, задающие первый момент 
 // времени и три целых числа, задающих второй момент времени. Выведите число секунд между этими моментами времени.
//  Scanner scanner = new Scanner(System.in);

//         int hours1 = scanner.nextInt();
//         int minutes1 = scanner.nextInt();
//         int seconds1 = scanner.nextInt();
        
//         int hours2 = scanner.nextInt();
//         int minutes2 = scanner.nextInt();
//         int seconds2 = scanner.nextInt();
        
//         int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1;
//         int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2;
        
//         int differenceInSeconds = totalSeconds2 - totalSeconds1;

//         System.out.println(differenceInSeconds);
        }

    }

 