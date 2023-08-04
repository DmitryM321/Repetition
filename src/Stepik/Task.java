package Stepik;

import java.security.MessageDigest;

public class Task {   
     public static void main(String[] args) throws Exception {
        int year =100;
        System.out.println(leapYearCount(year));
     }

     public static int leapYearCount(int year) {
            int sum = 0;
             for (int i = 0; i < year; i++) {
                if(year <=3){
                return 0;
                }
               if (i % 4 == 0 && (i % 100 != 0 ^ i % 400 == 0)) {
                     sum++;
                }             
        //   }  else  {
        //         return 0;
     }return sum;
            
    } 
        
    }
    

