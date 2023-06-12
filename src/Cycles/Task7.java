package Cycles;
//Напишите программу, которая выводит в консоль последовательность чисел:
//1 2 4 8 16 32 64 128 256 512
public class Task7 {
    public static void main(String[] args) {
        for (int i = 1; i <=512; i=i*2 ) {
            System.out.print(i + " ");
        }
    }
}
