package Cycles;
// Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
// а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
public class Task14 {
    public static void main(String[] args) {
        double amountSavings = 15000;
        int month = 0;
        while (amountSavings <= 12000000) {
            amountSavings = amountSavings * 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплено " + amountSavings);
            }
        } System.out.println("Итого месяцев накопления " + month);
    }
}