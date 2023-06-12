package Cycles;
//Перепишите решение задачи выше при условии,
// что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
public class Task9 {
    public static void main(String[] args) {
    double sum = 0;
    int mounth = 29000;
        for (int i = 1; i <= 12; i++) {
        sum = mounth + (sum*1.01);
        System.out.println("Месяц " + i + " сумма накоплений равна " + String.format("%.2f", sum) + " рублей");
    }
}
}