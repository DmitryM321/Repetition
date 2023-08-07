package Stepik;

public class Task3 {
public static void main(String[] args) {
    System.out.println(        'A' + "12");
     System.out.println(       'A' + '1' + "2");
      System.out.println(       "A" + 12);
       System.out.println(       "A" + ('\t' + '\u0003'));
        System.out.println(       "A" + '\u0003');
        String text = "Madam, I'm Adam!";
}
// Реализуйте метод, проверяющий, является ли заданная строка палиндромом. 
public static boolean isPalindrome(String text) {
    text.replaceAll("[^A-Za-z1-9]+","");


    return true;  
}
    
}
