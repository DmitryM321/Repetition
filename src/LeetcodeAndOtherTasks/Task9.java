package LeetcodeAndOtherTasks;

public class Task9 {
    public static void main(String[] args) {
 // Задача 1: Перевернуть строку. Описание: Напишите программу, которая переворачивает заданную строку.
String hello =  "Hello, World!";
StringBuilder hello2 = new StringBuilder(hello);
System.out.println(hello2.reverse());
char[] hello3 = hello.toCharArray();
char[] hello4 = new char[hello3.length];
// char[] v = new char[];
for (int i = hello3.length -1 , j = 0; i >= 0 ; i--, j++) {
   hello4[j] = hello3[i];
    
}
System.out.println(hello4);
// Задача 2: Подсчет количества гласных в строке
// Описание: Напишите программу, которая подсчитывает количество гласных букв в заданной строке.
String hello5 =  "Hello, World!";
String[] strr = hello5.split("");
int count = 0;
for (int i = 0; i < strr.length; i++) {
  if(strr[i].matches("[aeiouyAEIOUY]")){
    count++;
  }
}
System.out.println(count);

}}



