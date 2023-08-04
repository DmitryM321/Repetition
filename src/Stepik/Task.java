package Stepik;

import java.security.MessageDigest;

public class Task {   
     public static void main(String[] args) throws Exception {
        int year =400;
        System.out.println(leapYearCount(year));
     }

     public static int leapYearCount(int year) {
        int sum = (year / 4) - (year / 100) + (year / 400);
        return sum;
        
    }
}
    

