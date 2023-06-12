package Cycles;
// Выведите в консоль все четные числа от 0 до 17.
public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
