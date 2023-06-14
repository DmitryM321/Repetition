package Arrays;
// Напишите программу, которая посчитает среднее значение трат
public class Task4 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int dayInMonth = 31;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", sum/dayInMonth));
    }
}
