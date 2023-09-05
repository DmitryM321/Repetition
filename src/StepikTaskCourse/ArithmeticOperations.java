package StepikTaskCourse;
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
Scanner scanner = new Scanner(System.in);
 int v = scanner.nextInt();
 int t = scanner.nextInt();   
int circle = 109;
int fin = 0;

if(v > 0) {
    fin = (v * t) % circle;
} else {
    fin = Math.abs((v * t) % circle);
    if(fin == 0) {
        fin = 0;
    } else {
        fin = circle - fin;
    }
} 
        System.out.println(fin);
    }}