package Arrays;

public class Task3 {
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
        int maxDay = 0;
        int minDay = 2000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxDay) {
                maxDay = arr[i];
            }
            if (arr[i] < minDay)
                minDay = arr[i];
        }
            System.out.println("Максимальная сумма трат за день составила " + maxDay);
            System.out.println("Минимальная сумма трат за день составила "  +  minDay);
        }
    }

