package Cycles;
// Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
public class Task15 {
    public static void main(String[] args) {
    double amountSavings = 15000;
    int month = 0;
        while (month <= 108) {
        amountSavings = amountSavings * 1.07;
        month++;
        if (month % 6 == 0) {
            System.out.println("Месяц " + month + " накоплено " + amountSavings);
        }
    }
}
}
