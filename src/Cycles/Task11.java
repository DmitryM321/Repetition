package Cycles;
//С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
// что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
public class Task11 {
    public static void main(String[] args) {
        double sum = 0;
        int mounth = 15000;
        int i = 0;
        while (sum <= 2459000) {
            sum = mounth + (sum*1.01);
           i = i +1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + String.format("%.2f", sum) + " рублей");
        }
    }
}