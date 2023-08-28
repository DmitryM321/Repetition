package LeetcodeAndOtherTasks.RandomTasks;

public class Task11 {
public static void main(String[] args) {
    //   массив чисел и находит минимальное и максимальное значение. Вывести найденные значения на экран.
    int[] arr = {10, 5, 8, 3, 12};
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] < min){
        min = arr[i]; }
        if(arr[i] > max){
        max = arr[i];
    }}
    System.out.println(max + " " + min);
// на вход строка и находит сумму его цифр
String number = "12345";
char[] numb = number.toCharArray();
int sum = 0;
for (int i = 0; i < numb.length; i++) {
    sum  = sum + Character.getNumericValue(numb[i]);
}
System.out.println(sum);

String number2 = "12345"; 
int sum2 = 0;
for (int i = 0; i < number2.length(); i++) {
    sum2  = sum2 + Character.getNumericValue(number.charAt(i));
}
System.out.println(sum2);
}

}