package Stepik;

import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
        System.out.println('A' + "12");
        System.out.println('A' + '1' + "2");
        System.out.println("A" + 12);
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println("A" + '\u0003');
        String text = "Madam, I'm Adam!";

        System.out.println(isPalindrome(text));
        System.out.println(factorial(6));

    }

    // Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
    public static boolean isPalindrome(String text) {
        String text1 = text.replaceAll("[^A-Za-z0-9А-Яа-яЁё]", "");
        StringBuilder reverse = new StringBuilder(text1).reverse();
        return text1.equalsIgnoreCase(reverse.toString());
    }

    // Реализуйте метод, вычисляющий факториал заданного натурального числа.
    // Факториал N вычисляется как 1⋅2⋅...⋅N.
    public static int factorial1(int value) {
        int sum = 1;
        for (int index = 1; index <= value; index++) {
            sum = sum * index;
        }

        return sum;
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;

    }
}
