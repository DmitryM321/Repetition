package Cycles;
// Выведите на экран первые 11 членов последовательности Фибоначчи.
public class Task10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 11; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}