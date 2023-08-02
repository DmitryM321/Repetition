package CourseWork2;

import CourseWork2.enums.Type;
import CourseWork2.exeption.TaskNotFoundExeption;
import CourseWork2.task.DailyTask;
import CourseWork2.task.MonthlyTask;
import CourseWork2.task.OneTimeTask;
import CourseWork2.task.Task;
import CourseWork2.task.WeeklyTask;
import CourseWork2.task.YearlyTask;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws TaskNotFoundExeption {
       DailyTask dailyTask1 = new DailyTask("Ежедневная 1", Type.PERSONAL, "Задача 1", 
            LocalDateTime.of(2024, 03, 15, 12, 12));
       DailyTask dailyTask2 = new DailyTask("Ежедневная 2", Type.PERSONAL, "Задача 1.1", 
            LocalDateTime.of(2024, 03, 15, 12, 12));
       WeeklyTask weeklyTask1 = new WeeklyTask("Еженедельная 1", Type.WORK, "Задача 2", 
            LocalDateTime.of(2024, 03, 15, 12, 12));
       MonthlyTask monthlyTask = new MonthlyTask("Ежемесячная 3", Type.WORK, "Задача 3", 
            LocalDateTime.of(2024, 03, 15, 14, 12));
       YearlyTask yearlyTask = new YearlyTask("Ежегодная 4", Type.PERSONAL, "Задача 4", 
            LocalDateTime.of(2024, 03, 15, 15, 12));
       OneTimeTask oneTimeTask = new OneTimeTask("Разовая 5", Type.PERSONAL, "Задача 5", LocalDateTime.of(2023, 03, 15, 16, 12));

    

        TaskService taskService = new TaskService();
        taskService.add(dailyTask1); 
        taskService.add(weeklyTask1); 
        taskService.add(monthlyTask); 
        taskService.add(yearlyTask);    
        taskService.add(dailyTask2); 
        taskService.add(oneTimeTask);   

        Collection<Task> tasks = taskService.getAllByDay(LocalDateTime.of(2024, 03, 15, 12, 12 ));
          for (Task task : tasks) {
    System.out.println(task);
}

    taskService.remove(1); 
System.out.println("_____________________");
tasks = taskService.getAllByDay(LocalDateTime.of(2024, 03, 15, 12, 12)); 
  for (Task task : tasks) {
    System.out.println(task);
}
System.out.println("_____________________");
     System.out.println(taskService.getRemovedasks());


    }
}