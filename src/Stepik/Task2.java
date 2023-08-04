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

        long toString1 = Long.parseLong("12345");
        System.out.println(toString1);
        String fromNumber = Long.toString(toString1);
        System.out.println(fromNumber);
        int value1 = 0;
        System.out.println(isPowerOfTwo(value1));
        System.out.println(Integer.bitCount(32333));

    }
    public static boolean doubleExpression(double a, double b, double c) {
        boolean d;
        d=Math.abs (a+b-c)<0.001;
        return d;
    }

 
public static int flipBit(int value, int bitIndex) {
    return  value << (bitIndex -1);
}
public static boolean isPowerOfTwo(int value1) {
    int a = Math.abs(value1);
return Integer.bitCount(a) == 1;
}


}
