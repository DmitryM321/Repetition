package Cycles;
//Посчитайте с помощью цикла for сумму годовых накоплений,
// если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
public class Task8 {
    public static void main(String[] args) {
        int sum = 0;
        int mounth = 29000;
        for (int i = 1; i <= 12; i++) {
            sum = mounth + sum;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
    }
}
