package CourseWork2.task;

import CourseWork2.enums.Type;
import CourseWork2.exeption.IncorrectArgumentExeption;

import java.time.LocalDateTime;

public class MonthlyTask extends Task{

    public MonthlyTask(String title, Type type, String description, LocalDateTime dataTime) {
        super(title, type, description, dataTime);
    }
}

