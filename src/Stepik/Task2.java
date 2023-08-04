package Stepik;

public class Task2 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        System.out.println(doubleExpression(a, b, c));
        System.out.println("444444");
        System.out.println(0x0bp3);
        int value = 13;
        int bitIndex = 2;
        System.out.println(flipBit(value, bitIndex));

        int d = 11;
        Integer d1 = Integer.valueOf(d);
        System.out.println(d1);
        int d2 = d1.intValue();
        System.out.println(d2);

    }
    public static boolean doubleExpression(double a, double b, double c) {
        boolean d;
        d=Math.abs (a+b-c)<0.001;
        return d;
    }

/**
 * Flips one bit of the given <code>value</code>.
 *
 * @param value     any number
 * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
 * @return new value with one bit flipped
 13 = 8+4+1 = 1000 + 100+ 1
 */
public static int flipBit(int value, int bitIndex) {
    return  value << (bitIndex -1);
}



}
