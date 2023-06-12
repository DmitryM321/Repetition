package Cycles;
// Напишите программу, которая выводит в консоль последовательность чисел:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98
public class Task6 {
    public static void main(String[] args) {
        for (int i = 7; i <= 98; i++) {
            if(i%7 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
