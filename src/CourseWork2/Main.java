package CourseWork2;

import CourseWork2.enums.Type;
import CourseWork2.task.DailyTask;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DailyTask dailyTask1 = new DailyTask("Ежедневная 1", Type.PERSONAL, "Задача 1", LocalDateTime.of(2023, 03, 15, 12, 12));
    }
}
