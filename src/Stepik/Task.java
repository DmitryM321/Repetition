package Stepik;

import java.security.MessageDigest;

public class Task {   
     public static void main(String[] args) throws Exception {
        
        int year =404;
        System.out.println(isLeapYear(year));
     }

        public static boolean isLeapYear(int year) {
       
        if (year % 4 == 0 && (year % 100 != 0 ^ year % 400 == 0)) {
                return true;
            }
        
        return false;
    }
    
}

