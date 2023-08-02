package CourseWork2;

import CourseWork2.enums.Type;
import CourseWork2.exeption.TaskNotFoundExeption;
import CourseWork2.task.DailyTask;
import CourseWork2.task.WeeklyTask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws TaskNotFoundExeption {
        DailyTask dailyTask1 = new DailyTask("Ежедневная 1", Type.PERSONAL, "Задача 1", 
            LocalDateTime.of(2023, 03, 15, 12, 12));
       WeeklyTask weeklyTask1 = new WeeklyTask("Еженедельная 1", Type.WORK, "Задача 2", 
            LocalDateTime.of(2023, 03, 15, 12, 12));
System.out.println(dailyTask1);

        TaskService taskService = new TaskService();
        taskService.add(dailyTask1); 
        taskService.getAllByDay(LocalDateTime.of(2023, 03, 15, 11, 11));
       taskService.remove(0);
     System.out.println(taskService);   
    }
}
