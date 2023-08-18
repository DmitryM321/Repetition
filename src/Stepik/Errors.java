package Stepik;

public class Errors {
    public static void main(String[] args) {
        double x =  4;
        System.out.println(sqrt(x));

    }
    public static double sqrt(double x) {
      if(x < 0){
        throw new IllegalArgumentException("Expected non-negative number, got " + x); 
    }
           
        return Math.sqrt(x);  
    }
}
