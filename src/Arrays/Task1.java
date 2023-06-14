package Arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));
        double [] b = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(b));
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
    }
}
