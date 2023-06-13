package Cycles;
//накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
//Вычислите, сколько месяцев нужно будет копить, чтобы собрать сумму в 12 миллионов
public class Task13 {
    public static void main(String[] args) {
        double amountSavings = 15000;
        int month = 0;
        while (amountSavings <= 12000000){
            amountSavings = amountSavings*1.07;
            month++;
            System.out.println("Месяц " + month + " накоплено " + amountSavings);
        }
        System.out.println("Итого месяцев накопления " + month);
    }
}
