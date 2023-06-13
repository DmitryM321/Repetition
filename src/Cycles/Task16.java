package Cycles;
// Выведите на каждую пятницу месяца (включая полученную) сообщение
// следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
public class Task16 {
    public static void main(String[] args) {
        int firstDayMonth = 7;
        int friday = (5 - firstDayMonth + 7) % 7 + 1;
        System.out.printf("Сегодня пятница, %02d-е число. Необходимо подготовить отчет%n", friday);
        while (friday + 7 <= 31) { // выводим сообщения для остальных пятниц месяца
            friday += 7;
            System.out.printf("Сегодня пятница, %02d-е число. Необходимо подготовить отчет%n", friday);
        }
    }
}