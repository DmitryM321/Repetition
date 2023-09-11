package Stepik;
 import java.util.Scanner;
public class Potoki {
 //Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных 
 // в тексте вещественных чисел с точностью до шестого знака после запятой. Числом считается 
 //последовательность символов, отделенная от окружающего текста пробелами или переводами строк и 
 // успешно разбираемая методом Double.parseDouble.
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s+");

        double sum = 0.0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }

        System.out.printf("%.6f", sum);
    }
}
    
 