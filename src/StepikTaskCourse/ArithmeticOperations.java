package StepikTaskCourse;
import java.lang.reflect.Array;
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
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();

int nextEvenNumber = (number / 2 + 1) * 2;

System.out.println(nextEvenNumber);

    }}